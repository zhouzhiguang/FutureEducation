package com.futureeducation.commonmodule.permission;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.apkfuns.logutils.LogUtils;
import com.futureeducation.commonmodule.R;
import com.futureeducation.commonmodule.activities.CommonActivity;
import com.futureeducation.commonmodule.fragment.CommonFragment;
import com.futureeducation.commonmodule.utill.ToastUtils;
import com.yanzhenjie.permission.Action;
import com.yanzhenjie.permission.AndPermission;

import java.util.List;

/**
 * 权限请求工具类
 */
public class AndPermissionUtill {
    private AppCompatActivity activity;
    private CommonFragment fragment;
    private Context context;
    private PermissionResultListener listener;

    public AndPermissionUtill(AppCompatActivity activity) {

        this.activity = activity;
        this.context = activity;
    }

    public AndPermissionUtill(CommonFragment fragment) {
        this.fragment = fragment;
        this.context = fragment.getContext();
        this.activity = (CommonActivity) context;
    }
    public AndPermissionUtill(Fragment fragment) {
        this.context = fragment.getContext();
        this.activity = (AppCompatActivity) fragment.getActivity();
    }

    /**
     * Request permissions.
     */
    public void requestPermission(String... permissions) {
        AndPermission.with(context)
                .runtime()
                .permission(permissions)
                .rationale(new DefaultRationale())
                .onGranted(new Action<List<String>>() {
                    @Override
                    public void onAction(List<String> permissions) {
                        if (listener != null) {
                            listener.OnPermissionSuccess();
                        }
                    }
                })
                .onDenied(new Action<List<String>>() {
                    @Override
                    public void onAction(@NonNull List<String> permissions) {
                        if (AndPermission.hasAlwaysDeniedPermission(context, permissions)) {
                            //拒绝总是拒绝判断
                            if (AndPermission.hasAlwaysDeniedPermission(context, permissions)) {
                                PermissionsDialog dialog = new PermissionsDialog();
                                dialog.showSettingDialog(activity, permissions);
                                dialog.setPermissionStatListener(new PermissionsDialog.PermissionStatListener() {
                                    @Override
                                    public void sethasPermissions(boolean permissionsStat) {
                                        if (permissionsStat) {
                                            //去设置界面
                                            LogUtils.e("跳转到设置界面");
                                            if (listener != null) {
                                                listener.OnPermissionSeting();
                                            }
                                        } else {
                                            //取消操作
                                            ToastUtils.showToast(context, R.string.authorization_failed);
                                            LogUtils.e("点击取消按钮了");
                                            activity.finish();
                                            //requestPermission(permissions);
                                        }
                                    }
                                });
                                // Toast.makeText(SpalshActivity.this, R.string.message_setting_comeback, Toast.LENGTH_SHORT).show();
                            } else {
                                ToastUtils.showToast(context, "授权失败了---");
                                requestPermission();
                            }
                        }
                    }

                }).start();
    }

    public void setPermissionStatListener(PermissionResultListener listener) {
        this.listener = listener;
    }

    public interface PermissionResultListener {
        void OnPermissionSuccess();
        void OnPermissionSeting();
    }
}
