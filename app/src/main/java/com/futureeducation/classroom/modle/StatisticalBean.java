package com.futureeducation.classroom.modle;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by StatisticalBean.
 * User: ASUS
 * Date: 2019/11/14
 * Time: 10:50
 * 数据统计实体类
 */
public class StatisticalBean {


    /**
     * 44 : {"wal_id":"75a85646-df96-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"249","gla_id":"9dcbc092-5093-4396-ba7d-fa230e544d38","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d87e2b26-9609-4d67-be7a-91f0c555abd0","wei_duration":"439"}
     * 45 : {"wal_id":"78823a00-df94-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"0","wal_time3":"0","wal_time2":"1034","gla_id":"fcff18d9-6d19-44fc-8cf9-6e0a52d1fc6e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d039b5cb-e2cf-4d15-8645-aaba7feed14f","wei_duration":"439"}
     * 46 : {"wal_id":"7bd0658f-e051-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"3","wal_time3":"0","wal_time2":"0","gla_id":"84326142-b1ee-4919-b46f-d59f238271bd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f4accf87-8c6b-4ef7-b272-80748aba44a2","wei_duration":"439"}
     * 47 : {"wal_id":"8066bdf5-e03d-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"19d0bf0e-02f8-4e14-8f7a-fe1f33550ead","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"006806e6-8411-49c9-82e2-77ed310f2e9f","wei_duration":"439"}
     * 48 : {"wal_id":"80c393c0-e05f-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"0","gla_id":"991ca549-1a61-4c7e-a895-7f5b8a2a3286","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f88e12dc-2e22-41c3-9cb7-8f0323716d93","wei_duration":"439"}
     * 49 : {"wal_id":"80efc376-e05f-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"68","gla_id":"991ca549-1a61-4c7e-a895-7f5b8a2a3286","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f88e12dc-2e22-41c3-9cb7-8f0323716d93","wei_duration":"439"}
     * 50 : {"wal_id":"89b36654-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"0","gla_id":"ab23fbe9-f2ee-44f6-8285-97c72301ef9c","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"a91c83cb-d21a-4bfd-b096-8516eb206630","wei_duration":"439"}
     * 51 : {"wal_id":"89fbbdaf-df93-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"575","gla_id":"ab23fbe9-f2ee-44f6-8285-97c72301ef9c","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"a91c83cb-d21a-4bfd-b096-8516eb206630","wei_duration":"439"}
     * 52 : {"wal_id":"8cdb0f93-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"182","wal_time3":"0","wal_time2":"0","gla_id":"6a432844-816a-4920-857a-44d8c288278e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"655930ca-c4a2-4d0e-8135-4c75317b25b1","wei_duration":"439"}
     * 53 : {"wal_id":"900af749-e064-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"120","wal_time3":"0","wal_time2":"0","gla_id":"400e7128-f984-4cb8-ab9d-fbeab392d6dd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"4930d769-f648-4d48-ad63-a04113ad9e1e","wei_duration":"439"}
     * 10 : {"wal_id":"250e930c-e03d-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"10","wal_time3":"0","wal_time2":"0","gla_id":"19d0bf0e-02f8-4e14-8f7a-fe1f33550ead","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"006806e6-8411-49c9-82e2-77ed310f2e9f","wei_duration":"439"}
     * 54 : {"wal_id":"9049807a-e064-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"120","wal_time3":"0","wal_time2":"224","gla_id":"400e7128-f984-4cb8-ab9d-fbeab392d6dd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"4930d769-f648-4d48-ad63-a04113ad9e1e","wei_duration":"439"}
     * 11 : {"wal_id":"253eefde-e03d-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"10","wal_time3":"0","wal_time2":"251","gla_id":"19d0bf0e-02f8-4e14-8f7a-fe1f33550ead","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"006806e6-8411-49c9-82e2-77ed310f2e9f","wei_duration":"439"}
     * 55 : {"wal_id":"a0ef690f-df92-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"fcff18d9-6d19-44fc-8cf9-6e0a52d1fc6e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d039b5cb-e2cf-4d15-8645-aaba7feed14f","wei_duration":"439"}
     * 12 : {"wal_id":"2781797b-df94-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"425","wal_time3":"0","wal_time2":"0","gla_id":"c163eeea-6710-4418-b08d-360b9dc075fb","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"927e6d72-ba2c-4187-9bf0-15910815d54f","wei_duration":"439"}
     * 56 : {"wal_id":"a1131279-df96-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"0d52a36e-57cf-45f9-9503-d4e4a4008a8e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16","wei_duration":"439"}
     * 13 : {"wal_id":"27be2ac8-df94-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"425","wal_time3":"0","wal_time2":"629","gla_id":"c163eeea-6710-4418-b08d-360b9dc075fb","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"927e6d72-ba2c-4187-9bf0-15910815d54f","wei_duration":"439"}
     * 57 : {"wal_id":"a596e589-f714-11e9-8599-506b4bb81742","wal_type":"1001","glc_checked":"1","wal_time1":"3","wal_time3":"0","wal_time2":"0","gla_id":"9dcbc092-5093-4396-ba7d-fa230e544d38","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d87e2b26-9609-4d67-be7a-91f0c555abd0","wei_duration":"439"}
     * 14 : {"wal_id":"2a61c244-f714-11e9-8599-506b4bb81742","wal_type":"1001","glc_checked":"1","wal_time1":"68","wal_time3":"0","wal_time2":"0","gla_id":"9dcbc092-5093-4396-ba7d-fa230e544d38","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d87e2b26-9609-4d67-be7a-91f0c555abd0","wei_duration":"439"}
     * 58 : {"wal_id":"b1ddbf25-df96-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"100","wal_time3":"0","wal_time2":"0","gla_id":"0d52a36e-57cf-45f9-9503-d4e4a4008a8e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16","wei_duration":"439"}
     * 15 : {"wal_id":"2bc34148-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"50","wal_time3":"0","wal_time2":"0","gla_id":"c163eeea-6710-4418-b08d-360b9dc075fb","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"927e6d72-ba2c-4187-9bf0-15910815d54f","wei_duration":"439"}
     * 59 : {"wal_id":"b2238cc0-e051-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"3","wal_time3":"0","wal_time2":"0","gla_id":"84326142-b1ee-4919-b46f-d59f238271bd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f4accf87-8c6b-4ef7-b272-80748aba44a2","wei_duration":"439"}
     * 16 : {"wal_id":"2fd5957b-df9e-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"130","wal_time3":"0","wal_time2":"0","gla_id":"36f6e59d-ba65-4cff-9cf1-b12ffad83ade","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"da8b6500-5beb-4827-87c7-4f0791b486e9","wei_duration":"439"}
     * 17 : {"wal_id":"305d694f-df9a-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"0a164363-b964-40fd-8acf-68c12daded5b","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"c8fb91ed-147c-489b-9b13-e31564e1a6e5","wei_duration":"439"}
     * 18 : {"wal_id":"30865636-df9a-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"542","gla_id":"0a164363-b964-40fd-8acf-68c12daded5b","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"c8fb91ed-147c-489b-9b13-e31564e1a6e5","wei_duration":"439"}
     * 19 : {"wal_id":"36cff3b7-e061-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"16","wal_time3":"0","wal_time2":"0","gla_id":"d14e1872-ba4d-4bac-afac-a105f86d20f0","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"e8fe60f2-86d2-4b5e-80ca-61602edbf20c","per_id":"fda07632-02ed-411f-9c42-71a723ba02a3","wei_duration":"439"}
     * 1 : {"wal_id":"04c1206f-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"13","wal_time3":"0","wal_time2":"0","gla_id":"6a432844-816a-4920-857a-44d8c288278e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"655930ca-c4a2-4d0e-8135-4c75317b25b1","wei_duration":"439"}
     * 2 : {"wal_id":"0a305458-e053-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"656","gla_id":"84326142-b1ee-4919-b46f-d59f238271bd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f4accf87-8c6b-4ef7-b272-80748aba44a2","wei_duration":"439"}
     * 3 : {"wal_id":"0bcf1733-e053-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"0","gla_id":"84326142-b1ee-4919-b46f-d59f238271bd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f4accf87-8c6b-4ef7-b272-80748aba44a2","wei_duration":"439"}
     * 4 : {"wal_id":"145d75c5-df9e-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"29","wal_time3":"0","wal_time2":"0","gla_id":"03c57486-bff0-47b7-9634-77da90565b4a","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"e8fe60f2-86d2-4b5e-80ca-61602edbf20c","per_id":"9aa0adca-2f4d-41ad-bb2f-274b71040cda","wei_duration":"439"}
     * 5 : {"wal_id":"19d00584-df9e-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"114","wal_time3":"0","wal_time2":"0","gla_id":"36f6e59d-ba65-4cff-9cf1-b12ffad83ade","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"da8b6500-5beb-4827-87c7-4f0791b486e9","wei_duration":"439"}
     * 6 : {"wal_id":"1b158d21-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"42","wal_time3":"0","wal_time2":"0","gla_id":"c163eeea-6710-4418-b08d-360b9dc075fb","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"927e6d72-ba2c-4187-9bf0-15910815d54f","wei_duration":"439"}
     * 7 : {"wal_id":"1c0fe7d1-e03d-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"20","wal_time3":"0","wal_time2":"0","gla_id":"19d0bf0e-02f8-4e14-8f7a-fe1f33550ead","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"006806e6-8411-49c9-82e2-77ed310f2e9f","wei_duration":"439"}
     * 8 : {"wal_id":"1c601086-e03d-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"20","wal_time3":"0","wal_time2":"236","gla_id":"19d0bf0e-02f8-4e14-8f7a-fe1f33550ead","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"006806e6-8411-49c9-82e2-77ed310f2e9f","wei_duration":"439"}
     * 9 : {"wal_id":"21693c3b-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"30","wal_time3":"0","wal_time2":"0","gla_id":"6a432844-816a-4920-857a-44d8c288278e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"655930ca-c4a2-4d0e-8135-4c75317b25b1","wei_duration":"439"}
     * 60 : {"wal_id":"b2d12e8c-df96-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"100","wal_time3":"0","wal_time2":"0","gla_id":"0d52a36e-57cf-45f9-9503-d4e4a4008a8e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16","wei_duration":"439"}
     * 61 : {"wal_id":"b45eda2f-dfa6-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"35","wal_time3":"0","wal_time2":"0","gla_id":"f35d9b43-4c61-4bf7-8737-a8cf48e99262","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"e8fe60f2-86d2-4b5e-80ca-61602edbf20c","per_id":"59fbbbde-f954-4455-8ae2-cc3cfc5aad39","wei_duration":"439"}
     * 62 : {"wal_id":"b470995c-df96-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"100","wal_time3":"0","wal_time2":"816","gla_id":"0d52a36e-57cf-45f9-9503-d4e4a4008a8e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16","wei_duration":"439"}
     * 63 : {"wal_id":"b839aeb9-e052-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"314","wal_time3":"0","wal_time2":"0","gla_id":"84326142-b1ee-4919-b46f-d59f238271bd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f4accf87-8c6b-4ef7-b272-80748aba44a2","wei_duration":"439"}
     * 20 : {"wal_id":"3ac90286-df94-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"373","wal_time3":"0","wal_time2":"0","gla_id":"6a432844-816a-4920-857a-44d8c288278e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"655930ca-c4a2-4d0e-8135-4c75317b25b1","wei_duration":"439"}
     * 64 : {"wal_id":"b9034b81-e052-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"315","wal_time3":"0","wal_time2":"0","gla_id":"84326142-b1ee-4919-b46f-d59f238271bd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f4accf87-8c6b-4ef7-b272-80748aba44a2","wei_duration":"439"}
     * 21 : {"wal_id":"3ba49f6b-df94-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"0","wal_time3":"0","wal_time2":"932","gla_id":"fcff18d9-6d19-44fc-8cf9-6e0a52d1fc6e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d039b5cb-e2cf-4d15-8645-aaba7feed14f","wei_duration":"439"}
     * 65 : {"wal_id":"ca9b6078-df96-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"30","wal_time3":"0","wal_time2":"0","gla_id":"0d52a36e-57cf-45f9-9503-d4e4a4008a8e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16","wei_duration":"439"}
     * 22 : {"wal_id":"4882f9c2-df9e-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"130","wal_time3":"0","wal_time2":"0","gla_id":"36f6e59d-ba65-4cff-9cf1-b12ffad83ade","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"da8b6500-5beb-4827-87c7-4f0791b486e9","wei_duration":"439"}
     * 66 : {"wal_id":"cacbcf46-df96-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"30","wal_time3":"0","wal_time2":"853","gla_id":"0d52a36e-57cf-45f9-9503-d4e4a4008a8e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16","wei_duration":"439"}
     * 23 : {"wal_id":"4d5213fb-df9c-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"42","wal_time3":"0","wal_time2":"0","gla_id":"30dfdb94-74c5-4974-8105-e55aecd8ec7c","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"7044f19c-3c19-469d-becf-5391bba9d411","wei_duration":"439"}
     * 67 : {"wal_id":"d575c038-df94-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"0","gla_id":"b36810bf-1e24-4148-bdca-a50c3db37857","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"e8fe60f2-86d2-4b5e-80ca-61602edbf20c","per_id":"84a10bd7-26ef-4c05-8c5c-bde2a9a34edf","wei_duration":"439"}
     * 24 : {"wal_id":"4d81b6b3-df9c-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"42","wal_time3":"0","wal_time2":"170","gla_id":"30dfdb94-74c5-4974-8105-e55aecd8ec7c","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"7044f19c-3c19-469d-becf-5391bba9d411","wei_duration":"439"}
     * 68 : {"wal_id":"e4bf3c86-e0b6-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"11","wal_time3":"0","wal_time2":"0","gla_id":"e97a9768-a49d-4da5-9bd5-76d10122ecf8","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"a3161888-00eb-4875-9007-e9d13cd15c18","wei_duration":"439"}
     * 25 : {"wal_id":"5192f37c-df9e-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"8","wal_time3":"0","wal_time2":"0","gla_id":"36f6e59d-ba65-4cff-9cf1-b12ffad83ade","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"da8b6500-5beb-4827-87c7-4f0791b486e9","wei_duration":"439"}
     * 69 : {"wal_id":"e53494c1-e0b6-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"11","wal_time3":"0","wal_time2":"134","gla_id":"e97a9768-a49d-4da5-9bd5-76d10122ecf8","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"a3161888-00eb-4875-9007-e9d13cd15c18","wei_duration":"439"}
     * 26 : {"wal_id":"51aea537-df9e-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"8","wal_time3":"0","wal_time2":"317","gla_id":"36f6e59d-ba65-4cff-9cf1-b12ffad83ade","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"da8b6500-5beb-4827-87c7-4f0791b486e9","wei_duration":"439"}
     * 27 : {"wal_id":"58099fb1-df9c-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"20","wal_time3":"0","wal_time2":"0","gla_id":"30dfdb94-74c5-4974-8105-e55aecd8ec7c","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"7044f19c-3c19-469d-becf-5391bba9d411","wei_duration":"439"}
     * 28 : {"wal_id":"584c0658-df9c-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"20","wal_time3":"0","wal_time2":"188","gla_id":"30dfdb94-74c5-4974-8105-e55aecd8ec7c","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"7044f19c-3c19-469d-becf-5391bba9d411","wei_duration":"439"}
     * 29 : {"wal_id":"5b763d95-f714-11e9-8599-506b4bb81742","wal_type":"1001","glc_checked":"1","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"9dcbc092-5093-4396-ba7d-fa230e544d38","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d87e2b26-9609-4d67-be7a-91f0c555abd0","wei_duration":"439"}
     * 70 : {"wal_id":"ed6b3cb1-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"b36810bf-1e24-4148-bdca-a50c3db37857","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"e8fe60f2-86d2-4b5e-80ca-61602edbf20c","per_id":"84a10bd7-26ef-4c05-8c5c-bde2a9a34edf","wei_duration":"439"}
     * 71 : {"wal_id":"f47c24e8-e03d-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"19d0bf0e-02f8-4e14-8f7a-fe1f33550ead","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"006806e6-8411-49c9-82e2-77ed310f2e9f","wei_duration":"439"}
     * 72 : {"wal_id":"f6173b87-e03d-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"602","gla_id":"19d0bf0e-02f8-4e14-8f7a-fe1f33550ead","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"006806e6-8411-49c9-82e2-77ed310f2e9f","wei_duration":"439"}
     * 73 : {"wal_id":"f6bf293d-df9c-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"0","wal_time3":"0","wal_time2":"454","gla_id":"51dc81b1-108d-434c-b950-a7568316ff8a","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d5287d2e-d426-486a-86cd-a7f73f5c711a","wei_duration":"439"}
     * 30 : {"wal_id":"5f7d2ad8-df96-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"9dcbc092-5093-4396-ba7d-fa230e544d38","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d87e2b26-9609-4d67-be7a-91f0c555abd0","wei_duration":"439"}
     * 74 : {"wal_id":"f787980e-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"11","wal_time3":"0","wal_time2":"0","gla_id":"b36810bf-1e24-4148-bdca-a50c3db37857","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"e8fe60f2-86d2-4b5e-80ca-61602edbf20c","per_id":"84a10bd7-26ef-4c05-8c5c-bde2a9a34edf","wei_duration":"439"}
     * 31 : {"wal_id":"62ab07cd-f714-11e9-8599-506b4bb81742","wal_type":"1001","glc_checked":"1","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"9dcbc092-5093-4396-ba7d-fa230e544d38","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d87e2b26-9609-4d67-be7a-91f0c555abd0","wei_duration":"439"}
     * 32 : {"wal_id":"6330f06b-f714-11e9-8599-506b4bb81742","wal_type":"1004","glc_checked":"1","wal_time1":"134","wal_time3":"0","wal_time2":"206","gla_id":"9dcbc092-5093-4396-ba7d-fa230e544d38","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d87e2b26-9609-4d67-be7a-91f0c555abd0","wei_duration":"439"}
     * 33 : {"wal_id":"642b3567-df9c-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"37","wal_time3":"0","wal_time2":"0","gla_id":"30dfdb94-74c5-4974-8105-e55aecd8ec7c","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"7044f19c-3c19-469d-becf-5391bba9d411","wei_duration":"439"}
     * 34 : {"wal_id":"64b47143-df9c-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"37","wal_time3":"0","wal_time2":"209","gla_id":"30dfdb94-74c5-4974-8105-e55aecd8ec7c","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"7044f19c-3c19-469d-becf-5391bba9d411","wei_duration":"439"}
     * 35 : {"wal_id":"693bc735-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"c163eeea-6710-4418-b08d-360b9dc075fb","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"927e6d72-ba2c-4187-9bf0-15910815d54f","wei_duration":"439"}
     * 36 : {"wal_id":"69629d6d-df94-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"0","gla_id":"6a432844-816a-4920-857a-44d8c288278e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"655930ca-c4a2-4d0e-8135-4c75317b25b1","wei_duration":"439"}
     * 37 : {"wal_id":"69a38215-df94-11e9-a891-7cd30ae01514","wal_type":"1004","glc_checked":"0","wal_time1":"439","wal_time3":"0","wal_time2":"684","gla_id":"6a432844-816a-4920-857a-44d8c288278e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"655930ca-c4a2-4d0e-8135-4c75317b25b1","wei_duration":"439"}
     * 38 : {"wal_id":"69ce9bcc-e051-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"82","wal_time3":"0","wal_time2":"0","gla_id":"84326142-b1ee-4919-b46f-d59f238271bd","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"f4accf87-8c6b-4ef7-b272-80748aba44a2","wei_duration":"439"}
     * 39 : {"wal_id":"709bce11-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"c163eeea-6710-4418-b08d-360b9dc075fb","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"927e6d72-ba2c-4187-9bf0-15910815d54f","wei_duration":"439"}
     * 40 : {"wal_id":"718a5373-e061-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"130","wal_time3":"0","wal_time2":"0","gla_id":"d14e1872-ba4d-4bac-afac-a105f86d20f0","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"e8fe60f2-86d2-4b5e-80ca-61602edbf20c","per_id":"fda07632-02ed-411f-9c42-71a723ba02a3","wei_duration":"439"}
     * 41 : {"wal_id":"73e7e9f3-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"c163eeea-6710-4418-b08d-360b9dc075fb","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"927e6d72-ba2c-4187-9bf0-15910815d54f","wei_duration":"439"}
     * 42 : {"wal_id":"7401977f-df93-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"6a432844-816a-4920-857a-44d8c288278e","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"655930ca-c4a2-4d0e-8135-4c75317b25b1","wei_duration":"439"}
     * 43 : {"wal_id":"75532145-df96-11e9-a891-7cd30ae01514","wal_type":"1001","glc_checked":"0","wal_time1":"134","wal_time3":"0","wal_time2":"0","gla_id":"9dcbc092-5093-4396-ba7d-fa230e544d38","gla_group":"8069868a-cdc4-4a00-9be0-98627e54c167","wei_id":"BFFC513A-A6DB-3EF9-ACD5-6859874E92B1","per_id":"d87e2b26-9609-4d67-be7a-91f0c555abd0","wei_duration":"439"}
     */

    @JSONField(name = "44")
    private _$44Bean _$44;
    @JSONField(name = "45")
    private _$45Bean _$45;
    @JSONField(name = "46")
    private _$46Bean _$46;
    @JSONField(name = "47")
    private _$47Bean _$47;
    @JSONField(name = "48")
    private _$48Bean _$48;
    @JSONField(name = "49")
    private _$49Bean _$49;
    @JSONField(name = "50")
    private _$50Bean _$50;
    @JSONField(name = "51")
    private _$51Bean _$51;
    @JSONField(name = "52")
    private _$52Bean _$52;
    @JSONField(name = "53")
    private _$53Bean _$53;
    @JSONField(name = "10")
    private _$10Bean _$10;
    @JSONField(name = "54")
    private _$54Bean _$54;
    @JSONField(name = "11")
    private _$11Bean _$11;
    @JSONField(name = "55")
    private _$55Bean _$55;
    @JSONField(name = "12")
    private _$12Bean _$12;
    @JSONField(name = "56")
    private _$56Bean _$56;
    @JSONField(name = "13")
    private _$13Bean _$13;
    @JSONField(name = "57")
    private _$57Bean _$57;
    @JSONField(name = "14")
    private _$14Bean _$14;
    @JSONField(name = "58")
    private _$58Bean _$58;
    @JSONField(name = "15")
    private _$15Bean _$15;
    @JSONField(name = "59")
    private _$59Bean _$59;
    @JSONField(name = "16")
    private _$16Bean _$16;
    @JSONField(name = "17")
    private _$17Bean _$17;
    @JSONField(name = "18")
    private _$18Bean _$18;
    @JSONField(name = "19")
    private _$19Bean _$19;
    @JSONField(name = "1")
    private _$1Bean _$1;
    @JSONField(name = "2")
    private _$2Bean _$2;
    @JSONField(name = "3")
    private _$3Bean _$3;
    @JSONField(name = "4")
    private _$4Bean _$4;
    @JSONField(name = "5")
    private _$5Bean _$5;
    @JSONField(name = "6")
    private _$6Bean _$6;
    @JSONField(name = "7")
    private _$7Bean _$7;
    @JSONField(name = "8")
    private _$8Bean _$8;
    @JSONField(name = "9")
    private _$9Bean _$9;
    @JSONField(name = "60")
    private _$60Bean _$60;
    @JSONField(name = "61")
    private _$61Bean _$61;
    @JSONField(name = "62")
    private _$62Bean _$62;
    @JSONField(name = "63")
    private _$63Bean _$63;
    @JSONField(name = "20")
    private _$20Bean _$20;
    @JSONField(name = "64")
    private _$64Bean _$64;
    @JSONField(name = "21")
    private _$21Bean _$21;
    @JSONField(name = "65")
    private _$65Bean _$65;
    @JSONField(name = "22")
    private _$22Bean _$22;
    @JSONField(name = "66")
    private _$66Bean _$66;
    @JSONField(name = "23")
    private _$23Bean _$23;
    @JSONField(name = "67")
    private _$67Bean _$67;
    @JSONField(name = "24")
    private _$24Bean _$24;
    @JSONField(name = "68")
    private _$68Bean _$68;
    @JSONField(name = "25")
    private _$25Bean _$25;
    @JSONField(name = "69")
    private _$69Bean _$69;
    @JSONField(name = "26")
    private _$26Bean _$26;
    @JSONField(name = "27")
    private _$27Bean _$27;
    @JSONField(name = "28")
    private _$28Bean _$28;
    @JSONField(name = "29")
    private _$29Bean _$29;
    @JSONField(name = "70")
    private _$70Bean _$70;
    @JSONField(name = "71")
    private _$71Bean _$71;
    @JSONField(name = "72")
    private _$72Bean _$72;
    @JSONField(name = "73")
    private _$73Bean _$73;
    @JSONField(name = "30")
    private _$30Bean _$30;
    @JSONField(name = "74")
    private _$74Bean _$74;
    @JSONField(name = "31")
    private _$31Bean _$31;
    @JSONField(name = "32")
    private _$32Bean _$32;
    @JSONField(name = "33")
    private _$33Bean _$33;
    @JSONField(name = "34")
    private _$34Bean _$34;
    @JSONField(name = "35")
    private _$35Bean _$35;
    @JSONField(name = "36")
    private _$36Bean _$36;
    @JSONField(name = "37")
    private _$37Bean _$37;
    @JSONField(name = "38")
    private _$38Bean _$38;
    @JSONField(name = "39")
    private _$39Bean _$39;
    @JSONField(name = "40")
    private _$40Bean _$40;
    @JSONField(name = "41")
    private _$41Bean _$41;
    @JSONField(name = "42")
    private _$42Bean _$42;
    @JSONField(name = "43")
    private _$43Bean _$43;

    public _$44Bean get_$44() {
        return _$44;
    }

    public void set_$44(_$44Bean _$44) {
        this._$44 = _$44;
    }

    public _$45Bean get_$45() {
        return _$45;
    }

    public void set_$45(_$45Bean _$45) {
        this._$45 = _$45;
    }

    public _$46Bean get_$46() {
        return _$46;
    }

    public void set_$46(_$46Bean _$46) {
        this._$46 = _$46;
    }

    public _$47Bean get_$47() {
        return _$47;
    }

    public void set_$47(_$47Bean _$47) {
        this._$47 = _$47;
    }

    public _$48Bean get_$48() {
        return _$48;
    }

    public void set_$48(_$48Bean _$48) {
        this._$48 = _$48;
    }

    public _$49Bean get_$49() {
        return _$49;
    }

    public void set_$49(_$49Bean _$49) {
        this._$49 = _$49;
    }

    public _$50Bean get_$50() {
        return _$50;
    }

    public void set_$50(_$50Bean _$50) {
        this._$50 = _$50;
    }

    public _$51Bean get_$51() {
        return _$51;
    }

    public void set_$51(_$51Bean _$51) {
        this._$51 = _$51;
    }

    public _$52Bean get_$52() {
        return _$52;
    }

    public void set_$52(_$52Bean _$52) {
        this._$52 = _$52;
    }

    public _$53Bean get_$53() {
        return _$53;
    }

    public void set_$53(_$53Bean _$53) {
        this._$53 = _$53;
    }

    public _$10Bean get_$10() {
        return _$10;
    }

    public void set_$10(_$10Bean _$10) {
        this._$10 = _$10;
    }

    public _$54Bean get_$54() {
        return _$54;
    }

    public void set_$54(_$54Bean _$54) {
        this._$54 = _$54;
    }

    public _$11Bean get_$11() {
        return _$11;
    }

    public void set_$11(_$11Bean _$11) {
        this._$11 = _$11;
    }

    public _$55Bean get_$55() {
        return _$55;
    }

    public void set_$55(_$55Bean _$55) {
        this._$55 = _$55;
    }

    public _$12Bean get_$12() {
        return _$12;
    }

    public void set_$12(_$12Bean _$12) {
        this._$12 = _$12;
    }

    public _$56Bean get_$56() {
        return _$56;
    }

    public void set_$56(_$56Bean _$56) {
        this._$56 = _$56;
    }

    public _$13Bean get_$13() {
        return _$13;
    }

    public void set_$13(_$13Bean _$13) {
        this._$13 = _$13;
    }

    public _$57Bean get_$57() {
        return _$57;
    }

    public void set_$57(_$57Bean _$57) {
        this._$57 = _$57;
    }

    public _$14Bean get_$14() {
        return _$14;
    }

    public void set_$14(_$14Bean _$14) {
        this._$14 = _$14;
    }

    public _$58Bean get_$58() {
        return _$58;
    }

    public void set_$58(_$58Bean _$58) {
        this._$58 = _$58;
    }

    public _$15Bean get_$15() {
        return _$15;
    }

    public void set_$15(_$15Bean _$15) {
        this._$15 = _$15;
    }

    public _$59Bean get_$59() {
        return _$59;
    }

    public void set_$59(_$59Bean _$59) {
        this._$59 = _$59;
    }

    public _$16Bean get_$16() {
        return _$16;
    }

    public void set_$16(_$16Bean _$16) {
        this._$16 = _$16;
    }

    public _$17Bean get_$17() {
        return _$17;
    }

    public void set_$17(_$17Bean _$17) {
        this._$17 = _$17;
    }

    public _$18Bean get_$18() {
        return _$18;
    }

    public void set_$18(_$18Bean _$18) {
        this._$18 = _$18;
    }

    public _$19Bean get_$19() {
        return _$19;
    }

    public void set_$19(_$19Bean _$19) {
        this._$19 = _$19;
    }

    public _$1Bean get_$1() {
        return _$1;
    }

    public void set_$1(_$1Bean _$1) {
        this._$1 = _$1;
    }

    public _$2Bean get_$2() {
        return _$2;
    }

    public void set_$2(_$2Bean _$2) {
        this._$2 = _$2;
    }

    public _$3Bean get_$3() {
        return _$3;
    }

    public void set_$3(_$3Bean _$3) {
        this._$3 = _$3;
    }

    public _$4Bean get_$4() {
        return _$4;
    }

    public void set_$4(_$4Bean _$4) {
        this._$4 = _$4;
    }

    public _$5Bean get_$5() {
        return _$5;
    }

    public void set_$5(_$5Bean _$5) {
        this._$5 = _$5;
    }

    public _$6Bean get_$6() {
        return _$6;
    }

    public void set_$6(_$6Bean _$6) {
        this._$6 = _$6;
    }

    public _$7Bean get_$7() {
        return _$7;
    }

    public void set_$7(_$7Bean _$7) {
        this._$7 = _$7;
    }

    public _$8Bean get_$8() {
        return _$8;
    }

    public void set_$8(_$8Bean _$8) {
        this._$8 = _$8;
    }

    public _$9Bean get_$9() {
        return _$9;
    }

    public void set_$9(_$9Bean _$9) {
        this._$9 = _$9;
    }

    public _$60Bean get_$60() {
        return _$60;
    }

    public void set_$60(_$60Bean _$60) {
        this._$60 = _$60;
    }

    public _$61Bean get_$61() {
        return _$61;
    }

    public void set_$61(_$61Bean _$61) {
        this._$61 = _$61;
    }

    public _$62Bean get_$62() {
        return _$62;
    }

    public void set_$62(_$62Bean _$62) {
        this._$62 = _$62;
    }

    public _$63Bean get_$63() {
        return _$63;
    }

    public void set_$63(_$63Bean _$63) {
        this._$63 = _$63;
    }

    public _$20Bean get_$20() {
        return _$20;
    }

    public void set_$20(_$20Bean _$20) {
        this._$20 = _$20;
    }

    public _$64Bean get_$64() {
        return _$64;
    }

    public void set_$64(_$64Bean _$64) {
        this._$64 = _$64;
    }

    public _$21Bean get_$21() {
        return _$21;
    }

    public void set_$21(_$21Bean _$21) {
        this._$21 = _$21;
    }

    public _$65Bean get_$65() {
        return _$65;
    }

    public void set_$65(_$65Bean _$65) {
        this._$65 = _$65;
    }

    public _$22Bean get_$22() {
        return _$22;
    }

    public void set_$22(_$22Bean _$22) {
        this._$22 = _$22;
    }

    public _$66Bean get_$66() {
        return _$66;
    }

    public void set_$66(_$66Bean _$66) {
        this._$66 = _$66;
    }

    public _$23Bean get_$23() {
        return _$23;
    }

    public void set_$23(_$23Bean _$23) {
        this._$23 = _$23;
    }

    public _$67Bean get_$67() {
        return _$67;
    }

    public void set_$67(_$67Bean _$67) {
        this._$67 = _$67;
    }

    public _$24Bean get_$24() {
        return _$24;
    }

    public void set_$24(_$24Bean _$24) {
        this._$24 = _$24;
    }

    public _$68Bean get_$68() {
        return _$68;
    }

    public void set_$68(_$68Bean _$68) {
        this._$68 = _$68;
    }

    public _$25Bean get_$25() {
        return _$25;
    }

    public void set_$25(_$25Bean _$25) {
        this._$25 = _$25;
    }

    public _$69Bean get_$69() {
        return _$69;
    }

    public void set_$69(_$69Bean _$69) {
        this._$69 = _$69;
    }

    public _$26Bean get_$26() {
        return _$26;
    }

    public void set_$26(_$26Bean _$26) {
        this._$26 = _$26;
    }

    public _$27Bean get_$27() {
        return _$27;
    }

    public void set_$27(_$27Bean _$27) {
        this._$27 = _$27;
    }

    public _$28Bean get_$28() {
        return _$28;
    }

    public void set_$28(_$28Bean _$28) {
        this._$28 = _$28;
    }

    public _$29Bean get_$29() {
        return _$29;
    }

    public void set_$29(_$29Bean _$29) {
        this._$29 = _$29;
    }

    public _$70Bean get_$70() {
        return _$70;
    }

    public void set_$70(_$70Bean _$70) {
        this._$70 = _$70;
    }

    public _$71Bean get_$71() {
        return _$71;
    }

    public void set_$71(_$71Bean _$71) {
        this._$71 = _$71;
    }

    public _$72Bean get_$72() {
        return _$72;
    }

    public void set_$72(_$72Bean _$72) {
        this._$72 = _$72;
    }

    public _$73Bean get_$73() {
        return _$73;
    }

    public void set_$73(_$73Bean _$73) {
        this._$73 = _$73;
    }

    public _$30Bean get_$30() {
        return _$30;
    }

    public void set_$30(_$30Bean _$30) {
        this._$30 = _$30;
    }

    public _$74Bean get_$74() {
        return _$74;
    }

    public void set_$74(_$74Bean _$74) {
        this._$74 = _$74;
    }

    public _$31Bean get_$31() {
        return _$31;
    }

    public void set_$31(_$31Bean _$31) {
        this._$31 = _$31;
    }

    public _$32Bean get_$32() {
        return _$32;
    }

    public void set_$32(_$32Bean _$32) {
        this._$32 = _$32;
    }

    public _$33Bean get_$33() {
        return _$33;
    }

    public void set_$33(_$33Bean _$33) {
        this._$33 = _$33;
    }

    public _$34Bean get_$34() {
        return _$34;
    }

    public void set_$34(_$34Bean _$34) {
        this._$34 = _$34;
    }

    public _$35Bean get_$35() {
        return _$35;
    }

    public void set_$35(_$35Bean _$35) {
        this._$35 = _$35;
    }

    public _$36Bean get_$36() {
        return _$36;
    }

    public void set_$36(_$36Bean _$36) {
        this._$36 = _$36;
    }

    public _$37Bean get_$37() {
        return _$37;
    }

    public void set_$37(_$37Bean _$37) {
        this._$37 = _$37;
    }

    public _$38Bean get_$38() {
        return _$38;
    }

    public void set_$38(_$38Bean _$38) {
        this._$38 = _$38;
    }

    public _$39Bean get_$39() {
        return _$39;
    }

    public void set_$39(_$39Bean _$39) {
        this._$39 = _$39;
    }

    public _$40Bean get_$40() {
        return _$40;
    }

    public void set_$40(_$40Bean _$40) {
        this._$40 = _$40;
    }

    public _$41Bean get_$41() {
        return _$41;
    }

    public void set_$41(_$41Bean _$41) {
        this._$41 = _$41;
    }

    public _$42Bean get_$42() {
        return _$42;
    }

    public void set_$42(_$42Bean _$42) {
        this._$42 = _$42;
    }

    public _$43Bean get_$43() {
        return _$43;
    }

    public void set_$43(_$43Bean _$43) {
        this._$43 = _$43;
    }

    public static class _$44Bean {
        /**
         * wal_id : 75a85646-df96-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 249
         * gla_id : 9dcbc092-5093-4396-ba7d-fa230e544d38
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d87e2b26-9609-4d67-be7a-91f0c555abd0
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$45Bean {
        /**
         * wal_id : 78823a00-df94-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 0
         * wal_time3 : 0
         * wal_time2 : 1034
         * gla_id : fcff18d9-6d19-44fc-8cf9-6e0a52d1fc6e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d039b5cb-e2cf-4d15-8645-aaba7feed14f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$46Bean {
        /**
         * wal_id : 7bd0658f-e051-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 3
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 84326142-b1ee-4919-b46f-d59f238271bd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f4accf87-8c6b-4ef7-b272-80748aba44a2
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$47Bean {
        /**
         * wal_id : 8066bdf5-e03d-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 19d0bf0e-02f8-4e14-8f7a-fe1f33550ead
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 006806e6-8411-49c9-82e2-77ed310f2e9f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$48Bean {
        /**
         * wal_id : 80c393c0-e05f-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 991ca549-1a61-4c7e-a895-7f5b8a2a3286
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f88e12dc-2e22-41c3-9cb7-8f0323716d93
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$49Bean {
        /**
         * wal_id : 80efc376-e05f-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 68
         * wei_duration : 439
         * gla_id : 991ca549-1a61-4c7e-a895-7f5b8a2a3286
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f88e12dc-2e22-41c3-9cb7-8f0323716d93
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$50Bean {
        /**
         * wal_id : 89b36654-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : ab23fbe9-f2ee-44f6-8285-97c72301ef9c
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : a91c83cb-d21a-4bfd-b096-8516eb206630
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$51Bean {
        /**
         * wal_id : 89fbbdaf-df93-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 575
         * gla_id : ab23fbe9-f2ee-44f6-8285-97c72301ef9c
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : a91c83cb-d21a-4bfd-b096-8516eb206630
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$52Bean {
        /**
         * wal_id : 8cdb0f93-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 182
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 6a432844-816a-4920-857a-44d8c288278e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 655930ca-c4a2-4d0e-8135-4c75317b25b1
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$53Bean {
        /**
         * wal_id : 900af749-e064-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 120
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 400e7128-f984-4cb8-ab9d-fbeab392d6dd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 4930d769-f648-4d48-ad63-a04113ad9e1e
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$10Bean {
        /**
         * wal_id : 250e930c-e03d-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 10
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 19d0bf0e-02f8-4e14-8f7a-fe1f33550ead
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 006806e6-8411-49c9-82e2-77ed310f2e9f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$54Bean {
        /**
         * wal_id : 9049807a-e064-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 120
         * wal_time3 : 0
         * wal_time2 : 224
         * gla_id : 400e7128-f984-4cb8-ab9d-fbeab392d6dd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 4930d769-f648-4d48-ad63-a04113ad9e1e
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$11Bean {
        /**
         * wal_id : 253eefde-e03d-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 10
         * wal_time3 : 0
         * wal_time2 : 251
         * gla_id : 19d0bf0e-02f8-4e14-8f7a-fe1f33550ead
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 006806e6-8411-49c9-82e2-77ed310f2e9f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$55Bean {
        /**
         * wal_id : a0ef690f-df92-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : fcff18d9-6d19-44fc-8cf9-6e0a52d1fc6e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d039b5cb-e2cf-4d15-8645-aaba7feed14f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$12Bean {
        /**
         * wal_id : 2781797b-df94-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 425
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : c163eeea-6710-4418-b08d-360b9dc075fb
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 927e6d72-ba2c-4187-9bf0-15910815d54f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$56Bean {
        /**
         * wal_id : a1131279-df96-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 0d52a36e-57cf-45f9-9503-d4e4a4008a8e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$13Bean {
        /**
         * wal_id : 27be2ac8-df94-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 425
         * wal_time3 : 0
         * wal_time2 : 629
         * gla_id : c163eeea-6710-4418-b08d-360b9dc075fb
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 927e6d72-ba2c-4187-9bf0-15910815d54f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$57Bean {
        /**
         * wal_id : a596e589-f714-11e9-8599-506b4bb81742
         * wal_type : 1001
         * glc_checked : 1
         * wal_time1 : 3
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 9dcbc092-5093-4396-ba7d-fa230e544d38
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d87e2b26-9609-4d67-be7a-91f0c555abd0
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$14Bean {
        /**
         * wal_id : 2a61c244-f714-11e9-8599-506b4bb81742
         * wal_type : 1001
         * glc_checked : 1
         * wal_time1 : 68
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 9dcbc092-5093-4396-ba7d-fa230e544d38
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d87e2b26-9609-4d67-be7a-91f0c555abd0
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$58Bean {
        /**
         * wal_id : b1ddbf25-df96-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 100
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 0d52a36e-57cf-45f9-9503-d4e4a4008a8e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$15Bean {
        /**
         * wal_id : 2bc34148-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 50
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : c163eeea-6710-4418-b08d-360b9dc075fb
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 927e6d72-ba2c-4187-9bf0-15910815d54f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$59Bean {
        /**
         * wal_id : b2238cc0-e051-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 3
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 84326142-b1ee-4919-b46f-d59f238271bd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f4accf87-8c6b-4ef7-b272-80748aba44a2
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$16Bean {
        /**
         * wal_id : 2fd5957b-df9e-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 130
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 36f6e59d-ba65-4cff-9cf1-b12ffad83ade
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : da8b6500-5beb-4827-87c7-4f0791b486e9
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$17Bean {
        /**
         * wal_id : 305d694f-df9a-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 0a164363-b964-40fd-8acf-68c12daded5b
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : c8fb91ed-147c-489b-9b13-e31564e1a6e5
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$18Bean {
        /**
         * wal_id : 30865636-df9a-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 542
         * gla_id : 0a164363-b964-40fd-8acf-68c12daded5b
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : c8fb91ed-147c-489b-9b13-e31564e1a6e5
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$19Bean {
        /**
         * wal_id : 36cff3b7-e061-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 16
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : d14e1872-ba4d-4bac-afac-a105f86d20f0
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : e8fe60f2-86d2-4b5e-80ca-61602edbf20c
         * per_id : fda07632-02ed-411f-9c42-71a723ba02a3
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$1Bean {
        /**
         * wal_id : 04c1206f-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 13
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 6a432844-816a-4920-857a-44d8c288278e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 655930ca-c4a2-4d0e-8135-4c75317b25b1
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }


        @Override
        public String toString() {
            return "_$1Bean{" +
                    "wal_id='" + wal_id + '\'' +
                    ", wal_type='" + wal_type + '\'' +
                    ", glc_checked='" + glc_checked + '\'' +
                    ", wal_time1='" + wal_time1 + '\'' +
                    ", wal_time3='" + wal_time3 + '\'' +
                    ", wal_time2='" + wal_time2 + '\'' +
                    ", gla_id='" + gla_id + '\'' +
                    ", gla_group='" + gla_group + '\'' +
                    ", wei_id='" + wei_id + '\'' +
                    ", per_id='" + per_id + '\'' +
                    ", wei_duration='" + wei_duration + '\'' +
                    '}';
        }
    }

    public static class _$2Bean {
        /**
         * wal_id : 0a305458-e053-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 656
         * gla_id : 84326142-b1ee-4919-b46f-d59f238271bd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f4accf87-8c6b-4ef7-b272-80748aba44a2
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$3Bean {
        /**
         * wal_id : 0bcf1733-e053-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 84326142-b1ee-4919-b46f-d59f238271bd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f4accf87-8c6b-4ef7-b272-80748aba44a2
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$4Bean {
        /**
         * wal_id : 145d75c5-df9e-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 29
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 03c57486-bff0-47b7-9634-77da90565b4a
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : e8fe60f2-86d2-4b5e-80ca-61602edbf20c
         * per_id : 9aa0adca-2f4d-41ad-bb2f-274b71040cda
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$5Bean {
        /**
         * wal_id : 19d00584-df9e-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 114
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 36f6e59d-ba65-4cff-9cf1-b12ffad83ade
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : da8b6500-5beb-4827-87c7-4f0791b486e9
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$6Bean {
        /**
         * wal_id : 1b158d21-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 42
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : c163eeea-6710-4418-b08d-360b9dc075fb
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 927e6d72-ba2c-4187-9bf0-15910815d54f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$7Bean {
        /**
         * wal_id : 1c0fe7d1-e03d-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 20
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 19d0bf0e-02f8-4e14-8f7a-fe1f33550ead
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 006806e6-8411-49c9-82e2-77ed310f2e9f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$8Bean {
        /**
         * wal_id : 1c601086-e03d-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 20
         * wal_time3 : 0
         * wal_time2 : 236
         * gla_id : 19d0bf0e-02f8-4e14-8f7a-fe1f33550ead
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 006806e6-8411-49c9-82e2-77ed310f2e9f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$9Bean {
        /**
         * wal_id : 21693c3b-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 30
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 6a432844-816a-4920-857a-44d8c288278e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 655930ca-c4a2-4d0e-8135-4c75317b25b1
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$60Bean {
        /**
         * wal_id : b2d12e8c-df96-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 100
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 0d52a36e-57cf-45f9-9503-d4e4a4008a8e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$61Bean {
        /**
         * wal_id : b45eda2f-dfa6-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 35
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : f35d9b43-4c61-4bf7-8737-a8cf48e99262
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : e8fe60f2-86d2-4b5e-80ca-61602edbf20c
         * per_id : 59fbbbde-f954-4455-8ae2-cc3cfc5aad39
         * wei_duration : 439
         * <p>
         * 44次统计
         * <p>
         * 1002 跳转有主那个时间点跳转的   wal_time2跳转结束时间
         */

        private String wal_id;
        private String wal_type;//1001 暂停1002跳转1003  事件类型
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;//视频的总长度

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$62Bean {
        /**
         * wal_id : b470995c-df96-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 100
         * wal_time3 : 0
         * wal_time2 : 816
         * gla_id : 0d52a36e-57cf-45f9-9503-d4e4a4008a8e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$63Bean {
        /**
         * wal_id : b839aeb9-e052-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 314
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 84326142-b1ee-4919-b46f-d59f238271bd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f4accf87-8c6b-4ef7-b272-80748aba44a2
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$20Bean {
        /**
         * wal_id : 3ac90286-df94-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 373
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 6a432844-816a-4920-857a-44d8c288278e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 655930ca-c4a2-4d0e-8135-4c75317b25b1
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$64Bean {
        /**
         * wal_id : b9034b81-e052-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 315
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 84326142-b1ee-4919-b46f-d59f238271bd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f4accf87-8c6b-4ef7-b272-80748aba44a2
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$21Bean {
        /**
         * wal_id : 3ba49f6b-df94-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 0
         * wal_time3 : 0
         * wal_time2 : 932
         * gla_id : fcff18d9-6d19-44fc-8cf9-6e0a52d1fc6e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d039b5cb-e2cf-4d15-8645-aaba7feed14f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$65Bean {
        /**
         * wal_id : ca9b6078-df96-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 30
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 0d52a36e-57cf-45f9-9503-d4e4a4008a8e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$22Bean {
        /**
         * wal_id : 4882f9c2-df9e-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 130
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 36f6e59d-ba65-4cff-9cf1-b12ffad83ade
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : da8b6500-5beb-4827-87c7-4f0791b486e9
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$66Bean {
        /**
         * wal_id : cacbcf46-df96-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 30
         * wal_time3 : 0
         * wal_time2 : 853
         * gla_id : 0d52a36e-57cf-45f9-9503-d4e4a4008a8e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d9e6488e-aeb9-4885-ad4f-eea5b2d5ea16
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$23Bean {
        /**
         * wal_id : 4d5213fb-df9c-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 42
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 30dfdb94-74c5-4974-8105-e55aecd8ec7c
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 7044f19c-3c19-469d-becf-5391bba9d411
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$67Bean {
        /**
         * wal_id : d575c038-df94-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : b36810bf-1e24-4148-bdca-a50c3db37857
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : e8fe60f2-86d2-4b5e-80ca-61602edbf20c
         * per_id : 84a10bd7-26ef-4c05-8c5c-bde2a9a34edf
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$24Bean {
        /**
         * wal_id : 4d81b6b3-df9c-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 42
         * wal_time3 : 0
         * wal_time2 : 170
         * gla_id : 30dfdb94-74c5-4974-8105-e55aecd8ec7c
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 7044f19c-3c19-469d-becf-5391bba9d411
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$68Bean {
        /**
         * wal_id : e4bf3c86-e0b6-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 11
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : e97a9768-a49d-4da5-9bd5-76d10122ecf8
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : a3161888-00eb-4875-9007-e9d13cd15c18
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$25Bean {
        /**
         * wal_id : 5192f37c-df9e-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 8
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 36f6e59d-ba65-4cff-9cf1-b12ffad83ade
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : da8b6500-5beb-4827-87c7-4f0791b486e9
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$69Bean {
        /**
         * wal_id : e53494c1-e0b6-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 11
         * wal_time3 : 0
         * wal_time2 : 134
         * gla_id : e97a9768-a49d-4da5-9bd5-76d10122ecf8
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : a3161888-00eb-4875-9007-e9d13cd15c18
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$26Bean {
        /**
         * wal_id : 51aea537-df9e-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 8
         * wal_time3 : 0
         * wal_time2 : 317
         * gla_id : 36f6e59d-ba65-4cff-9cf1-b12ffad83ade
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : da8b6500-5beb-4827-87c7-4f0791b486e9
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$27Bean {
        /**
         * wal_id : 58099fb1-df9c-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 20
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 30dfdb94-74c5-4974-8105-e55aecd8ec7c
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 7044f19c-3c19-469d-becf-5391bba9d411
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$28Bean {
        /**
         * wal_id : 584c0658-df9c-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 20
         * wal_time3 : 0
         * wal_time2 : 188
         * gla_id : 30dfdb94-74c5-4974-8105-e55aecd8ec7c
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 7044f19c-3c19-469d-becf-5391bba9d411
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$29Bean {
        /**
         * wal_id : 5b763d95-f714-11e9-8599-506b4bb81742
         * wal_type : 1001
         * glc_checked : 1
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 9dcbc092-5093-4396-ba7d-fa230e544d38
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d87e2b26-9609-4d67-be7a-91f0c555abd0
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$70Bean {
        /**
         * wal_id : ed6b3cb1-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : b36810bf-1e24-4148-bdca-a50c3db37857
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : e8fe60f2-86d2-4b5e-80ca-61602edbf20c
         * per_id : 84a10bd7-26ef-4c05-8c5c-bde2a9a34edf
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$71Bean {
        /**
         * wal_id : f47c24e8-e03d-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 19d0bf0e-02f8-4e14-8f7a-fe1f33550ead
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 006806e6-8411-49c9-82e2-77ed310f2e9f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$72Bean {
        /**
         * wal_id : f6173b87-e03d-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 602
         * gla_id : 19d0bf0e-02f8-4e14-8f7a-fe1f33550ead
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 006806e6-8411-49c9-82e2-77ed310f2e9f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$73Bean {
        /**
         * wal_id : f6bf293d-df9c-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 0
         * wal_time3 : 0
         * wal_time2 : 454
         * gla_id : 51dc81b1-108d-434c-b950-a7568316ff8a
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d5287d2e-d426-486a-86cd-a7f73f5c711a
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$30Bean {
        /**
         * wal_id : 5f7d2ad8-df96-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 9dcbc092-5093-4396-ba7d-fa230e544d38
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d87e2b26-9609-4d67-be7a-91f0c555abd0
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$74Bean {
        /**
         * wal_id : f787980e-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 11
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : b36810bf-1e24-4148-bdca-a50c3db37857
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : e8fe60f2-86d2-4b5e-80ca-61602edbf20c
         * per_id : 84a10bd7-26ef-4c05-8c5c-bde2a9a34edf
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$31Bean {
        /**
         * wal_id : 62ab07cd-f714-11e9-8599-506b4bb81742
         * wal_type : 1001
         * glc_checked : 1
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 9dcbc092-5093-4396-ba7d-fa230e544d38
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d87e2b26-9609-4d67-be7a-91f0c555abd0
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$32Bean {
        /**
         * wal_id : 6330f06b-f714-11e9-8599-506b4bb81742
         * wal_type : 1004
         * glc_checked : 1
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 206
         * gla_id : 9dcbc092-5093-4396-ba7d-fa230e544d38
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d87e2b26-9609-4d67-be7a-91f0c555abd0
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$33Bean {
        /**
         * wal_id : 642b3567-df9c-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 37
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 30dfdb94-74c5-4974-8105-e55aecd8ec7c
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 7044f19c-3c19-469d-becf-5391bba9d411
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$34Bean {
        /**
         * wal_id : 64b47143-df9c-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 37
         * wal_time3 : 0
         * wal_time2 : 209
         * gla_id : 30dfdb94-74c5-4974-8105-e55aecd8ec7c
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 7044f19c-3c19-469d-becf-5391bba9d411
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$35Bean {
        /**
         * wal_id : 693bc735-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : c163eeea-6710-4418-b08d-360b9dc075fb
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 927e6d72-ba2c-4187-9bf0-15910815d54f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$36Bean {
        /**
         * wal_id : 69629d6d-df94-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 6a432844-816a-4920-857a-44d8c288278e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 655930ca-c4a2-4d0e-8135-4c75317b25b1
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$37Bean {
        /**
         * wal_id : 69a38215-df94-11e9-a891-7cd30ae01514
         * wal_type : 1004
         * glc_checked : 0
         * wal_time1 : 439
         * wal_time3 : 0
         * wal_time2 : 684
         * gla_id : 6a432844-816a-4920-857a-44d8c288278e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 655930ca-c4a2-4d0e-8135-4c75317b25b1
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$38Bean {
        /**
         * wal_id : 69ce9bcc-e051-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 82
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 84326142-b1ee-4919-b46f-d59f238271bd
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : f4accf87-8c6b-4ef7-b272-80748aba44a2
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$39Bean {
        /**
         * wal_id : 709bce11-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : c163eeea-6710-4418-b08d-360b9dc075fb
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 927e6d72-ba2c-4187-9bf0-15910815d54f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$40Bean {
        /**
         * wal_id : 718a5373-e061-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 130
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : d14e1872-ba4d-4bac-afac-a105f86d20f0
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : e8fe60f2-86d2-4b5e-80ca-61602edbf20c
         * per_id : fda07632-02ed-411f-9c42-71a723ba02a3
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$41Bean {
        /**
         * wal_id : 73e7e9f3-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : c163eeea-6710-4418-b08d-360b9dc075fb
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 927e6d72-ba2c-4187-9bf0-15910815d54f
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$42Bean {
        /**
         * wal_id : 7401977f-df93-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 6a432844-816a-4920-857a-44d8c288278e
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : 655930ca-c4a2-4d0e-8135-4c75317b25b1
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }

    public static class _$43Bean {
        /**
         * wal_id : 75532145-df96-11e9-a891-7cd30ae01514
         * wal_type : 1001
         * glc_checked : 0
         * wal_time1 : 134
         * wal_time3 : 0
         * wal_time2 : 0
         * gla_id : 9dcbc092-5093-4396-ba7d-fa230e544d38
         * gla_group : 8069868a-cdc4-4a00-9be0-98627e54c167
         * wei_id : BFFC513A-A6DB-3EF9-ACD5-6859874E92B1
         * per_id : d87e2b26-9609-4d67-be7a-91f0c555abd0
         * wei_duration : 439
         */

        private String wal_id;
        private String wal_type;
        private String glc_checked;
        private String wal_time1;
        private String wal_time3;
        private String wal_time2;
        private String gla_id;
        private String gla_group;
        private String wei_id;
        private String per_id;
        private String wei_duration;

        public String getWal_id() {
            return wal_id;
        }

        public void setWal_id(String wal_id) {
            this.wal_id = wal_id;
        }

        public String getWal_type() {
            return wal_type;
        }

        public void setWal_type(String wal_type) {
            this.wal_type = wal_type;
        }

        public String getGlc_checked() {
            return glc_checked;
        }

        public void setGlc_checked(String glc_checked) {
            this.glc_checked = glc_checked;
        }

        public String getWal_time1() {
            return wal_time1;
        }

        public void setWal_time1(String wal_time1) {
            this.wal_time1 = wal_time1;
        }

        public String getWal_time3() {
            return wal_time3;
        }

        public void setWal_time3(String wal_time3) {
            this.wal_time3 = wal_time3;
        }

        public String getWal_time2() {
            return wal_time2;
        }

        public void setWal_time2(String wal_time2) {
            this.wal_time2 = wal_time2;
        }

        public String getGla_id() {
            return gla_id;
        }

        public void setGla_id(String gla_id) {
            this.gla_id = gla_id;
        }

        public String getGla_group() {
            return gla_group;
        }

        public void setGla_group(String gla_group) {
            this.gla_group = gla_group;
        }

        public String getWei_id() {
            return wei_id;
        }

        public void setWei_id(String wei_id) {
            this.wei_id = wei_id;
        }

        public String getPer_id() {
            return per_id;
        }

        public void setPer_id(String per_id) {
            this.per_id = per_id;
        }

        public String getWei_duration() {
            return wei_duration;
        }

        public void setWei_duration(String wei_duration) {
            this.wei_duration = wei_duration;
        }
    }
}
