package com.futureeducation.classroom.utill;

import com.futureeducation.classroom.llistener.AnalysisWebListener;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnalysisWebutill.
 * User: ASUS
 * Date: 2019/11/13
 * Time: 16:38
 */
public class AnalysisWebutill {
    public AnalysisWebutill(String html, AnalysisWebListener listener) {
        Document doc = Jsoup.parse(html);
        Elements newsHeadlines = doc.select("#mp-itn b a");
        Element element = doc.body();
        String title = doc.title();
        Elements elements = element.getElementsByTag("p");
        List<String> dates = new ArrayList<>();
        if (elements != null && !elements.isEmpty()) {
            for (Element headline : elements) {
                String linkHref = headline.text();
                dates.add(linkHref);

            }
        }
        if (dates.size() > 0 && listener != null) {
            listener.OnAnalysisSucess(dates);
        }
    }
}
