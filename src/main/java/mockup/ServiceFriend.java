package mockup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("friend")
public class ServiceFriend {

    @GET
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String getFriends() {

        String json = "{\n" +
                "  \"results\": [\n" +
                "    {\n" +
                "      \"gender\": \"male\",\n" +
                "      \"name\": {\n" +
                "        \"title\": \"Mr\",\n" +
                "        \"first\": \"Alfonso\",\n" +
                "        \"last\": \"Peña\"\n" +
                "      },\n" +
                "      \"location\": {\n" +
                "        \"street\": {\n" +
                "          \"number\": 4896,\n" +
                "          \"name\": \"Paseo de Extremadura\"\n" +
                "        },\n" +
                "        \"city\": \"Valladolid\",\n" +
                "        \"state\": \"Extremadura\",\n" +
                "        \"country\": \"Spain\",\n" +
                "        \"postcode\": 90366,\n" +
                "        \"coordinates\": {\n" +
                "          \"latitude\": \"-25.2641\",\n" +
                "          \"longitude\": \"-93.8667\"\n" +
                "        },\n" +
                "        \"timezone\": {\n" +
                "          \"offset\": \"+3:30\",\n" +
                "          \"description\": \"Tehran\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"email\": \"alfonso.pena@example.com\",\n" +
                "      \"login\": {\n" +
                "        \"uuid\": \"1b97fe9e-9409-42e7-a05f-26e1c8e1839f\",\n" +
                "        \"username\": \"greenzebra217\",\n" +
                "        \"password\": \"1024\",\n" +
                "        \"salt\": \"MrdJk4BO\",\n" +
                "        \"md5\": \"d85017feb2f9b80c69ad8b7d1f7b9abe\",\n" +
                "        \"sha1\": \"ab95de3aa10a0156800889a24b55e2312381aaac\",\n" +
                "        \"sha256\": \"229f4ad020a19d04d2a7dd4dc6d4e53a6da6cb990f47a8b9174ec0872a766016\"\n" +
                "      },\n" +
                "      \"dob\": {\n" +
                "        \"date\": \"1966-02-25T07:50:20.172Z\",\n" +
                "        \"age\": 54\n" +
                "      },\n" +
                "      \"registered\": {\n" +
                "        \"date\": \"2018-04-15T21:28:00.688Z\",\n" +
                "        \"age\": 2\n" +
                "      },\n" +
                "      \"phone\": \"975-815-159\",\n" +
                "      \"cell\": \"603-795-200\",\n" +
                "      \"id\": {\n" +
                "        \"name\": \"DNI\",\n" +
                "        \"value\": \"02342334-U\"\n" +
                "      },\n" +
                "      \"picture\": {\n" +
                "        \"large\": \"https://randomuser.me/api/portraits/men/12.jpg\",\n" +
                "        \"medium\": \"https://randomuser.me/api/portraits/med/men/12.jpg\",\n" +
                "        \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/12.jpg\"\n" +
                "      },\n" +
                "      \"nat\": \"ES\"\n" +
                "    },\n" +
                "{\n" +
                "      \"gender\": \"male\",\n" +
                "      \"name\": {\n" +
                "        \"title\": \"Mr\",\n" +
                "        \"first\": \"Bill\",\n" +
                "        \"last\": \"Shelton\"\n" +
                "      },\n" +
                "      \"location\": {\n" +
                "        \"street\": {\n" +
                "          \"number\": 817,\n" +
                "          \"name\": \"W Pecan St\"\n" +
                "        },\n" +
                "        \"city\": \"Temecula\",\n" +
                "        \"state\": \"Arizona\",\n" +
                "        \"country\": \"United States\",\n" +
                "        \"postcode\": 39738,\n" +
                "        \"coordinates\": {\n" +
                "          \"latitude\": \"88.9542\",\n" +
                "          \"longitude\": \"-165.5364\"\n" +
                "        },\n" +
                "        \"timezone\": {\n" +
                "          \"offset\": \"-2:00\",\n" +
                "          \"description\": \"Mid-Atlantic\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"email\": \"bill.shelton@example.com\",\n" +
                "      \"login\": {\n" +
                "        \"uuid\": \"1d61ee05-75ff-4726-97a3-11b939bc4e1a\",\n" +
                "        \"username\": \"purpleduck161\",\n" +
                "        \"password\": \"jerry1\",\n" +
                "        \"salt\": \"Bv89DjyY\",\n" +
                "        \"md5\": \"ce3da13a6f9e2434574a3a97ea3b4ef2\",\n" +
                "        \"sha1\": \"2e27be826285fc7d74cc6f441d70bca30a230b4b\",\n" +
                "        \"sha256\": \"23cad8dcb6f6fd8c8ab831856723552a26c60f58f221d5196aa29a4b46b9681d\"\n" +
                "      },\n" +
                "      \"dob\": {\n" +
                "        \"date\": \"1949-05-27T12:59:13.767Z\",\n" +
                "        \"age\": 71\n" +
                "      },\n" +
                "      \"registered\": {\n" +
                "        \"date\": \"2014-07-03T18:22:59.193Z\",\n" +
                "        \"age\": 6\n" +
                "      },\n" +
                "      \"phone\": \"(267)-828-1627\",\n" +
                "      \"cell\": \"(821)-801-6790\",\n" +
                "      \"id\": {\n" +
                "        \"name\": \"SSN\",\n" +
                "        \"value\": \"771-97-0998\"\n" +
                "      },\n" +
                "      \"picture\": {\n" +
                "        \"large\": \"https://randomuser.me/api/portraits/men/58.jpg\",\n" +
                "        \"medium\": \"https://randomuser.me/api/portraits/med/men/58.jpg\",\n" +
                "        \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/58.jpg\"\n" +
                "      },\n" +
                "      \"nat\": \"US\"\n" +
                "    },\n" +
                "{\n" +
                "      \"gender\": \"male\",\n" +
                "      \"name\": {\n" +
                "        \"title\": \"Mr\",\n" +
                "        \"first\": \"Simon\",\n" +
                "        \"last\": \"Gagné\"\n" +
                "      },\n" +
                "      \"location\": {\n" +
                "        \"street\": {\n" +
                "          \"number\": 3980,\n" +
                "          \"name\": \"Lakeview Ave\"\n" +
                "        },\n" +
                "        \"city\": \"Springfield\",\n" +
                "        \"state\": \"Québec\",\n" +
                "        \"country\": \"Canada\",\n" +
                "        \"postcode\": \"K2C 2E9\",\n" +
                "        \"coordinates\": {\n" +
                "          \"latitude\": \"-64.6676\",\n" +
                "          \"longitude\": \"-157.7387\"\n" +
                "        },\n" +
                "        \"timezone\": {\n" +
                "          \"offset\": \"-11:00\",\n" +
                "          \"description\": \"Midway Island, Samoa\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"email\": \"simon.gagne@example.com\",\n" +
                "      \"login\": {\n" +
                "        \"uuid\": \"d5069cd6-4b82-45f3-8941-8dc0c7b4d6fa\",\n" +
                "        \"username\": \"crazybutterfly589\",\n" +
                "        \"password\": \"mobile\",\n" +
                "        \"salt\": \"sTHlv8nb\",\n" +
                "        \"md5\": \"69aee61b6d266c1979fb3cc6d93b4639\",\n" +
                "        \"sha1\": \"25a3f121f4bad3faca7179dc6357c1e1a9e6e127\",\n" +
                "        \"sha256\": \"81e94662f9cb6cc80adba63340f8a7540480352b51311014cd8deeebdd548e59\"\n" +
                "      },\n" +
                "      \"dob\": {\n" +
                "        \"date\": \"1991-06-06T07:14:05.574Z\",\n" +
                "        \"age\": 29\n" +
                "      },\n" +
                "      \"registered\": {\n" +
                "        \"date\": \"2015-05-24T22:22:43.045Z\",\n" +
                "        \"age\": 5\n" +
                "      },\n" +
                "      \"phone\": \"746-383-9673\",\n" +
                "      \"cell\": \"689-617-5647\",\n" +
                "      \"id\": {\n" +
                "        \"name\": \"\",\n" +
                "        \"value\": null\n" +
                "      },\n" +
                "      \"picture\": {\n" +
                "        \"large\": \"https://randomuser.me/api/portraits/men/2.jpg\",\n" +
                "        \"medium\": \"https://randomuser.me/api/portraits/med/men/2.jpg\",\n" +
                "        \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/2.jpg\"\n" +
                "      },\n" +
                "      \"nat\": \"CA\"\n" +
                "    },\n" +
                "{\n" +
                "      \"gender\": \"female\",\n" +
                "      \"name\": {\n" +
                "        \"title\": \"Miss\",\n" +
                "        \"first\": \"Zoëy\",\n" +
                "        \"last\": \"Rijpstra\"\n" +
                "      },\n" +
                "      \"location\": {\n" +
                "        \"street\": {\n" +
                "          \"number\": 6061,\n" +
                "          \"name\": \"Kleine Grachtstraat\"\n" +
                "        },\n" +
                "        \"city\": \"Wichmond\",\n" +
                "        \"state\": \"Flevoland\",\n" +
                "        \"country\": \"Netherlands\",\n" +
                "        \"postcode\": 74780,\n" +
                "        \"coordinates\": {\n" +
                "          \"latitude\": \"47.3374\",\n" +
                "          \"longitude\": \"3.8461\"\n" +
                "        },\n" +
                "        \"timezone\": {\n" +
                "          \"offset\": \"+5:45\",\n" +
                "          \"description\": \"Kathmandu\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"email\": \"zoey.rijpstra@example.com\",\n" +
                "      \"login\": {\n" +
                "        \"uuid\": \"f93c9ee2-b012-4952-abfa-889d0a3f1a7c\",\n" +
                "        \"username\": \"purplelion572\",\n" +
                "        \"password\": \"valkyrie\",\n" +
                "        \"salt\": \"bdkIwlOT\",\n" +
                "        \"md5\": \"b6d0c2639cbd789a410012ee8965db0d\",\n" +
                "        \"sha1\": \"dc197690c29fd0d4c9892310f934c87e59903557\",\n" +
                "        \"sha256\": \"0e211739642d33a0a5a82a18f88103625758386d221477a4d23e5e64151b3c96\"\n" +
                "      },\n" +
                "      \"dob\": {\n" +
                "        \"date\": \"1977-10-03T21:04:14.018Z\",\n" +
                "        \"age\": 43\n" +
                "      },\n" +
                "      \"registered\": {\n" +
                "        \"date\": \"2016-07-05T13:35:02.011Z\",\n" +
                "        \"age\": 4\n" +
                "      },\n" +
                "      \"phone\": \"(629)-064-7499\",\n" +
                "      \"cell\": \"(044)-152-8984\",\n" +
                "      \"id\": {\n" +
                "        \"name\": \"BSN\",\n" +
                "        \"value\": \"80247640\"\n" +
                "      },\n" +
                "      \"picture\": {\n" +
                "        \"large\": \"https://randomuser.me/api/portraits/women/5.jpg\",\n" +
                "        \"medium\": \"https://randomuser.me/api/portraits/med/women/5.jpg\",\n" +
                "        \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/5.jpg\"\n" +
                "      },\n" +
                "      \"nat\": \"NL\"\n" +
                "    },\n" +
                "{\n" +
                "      \"gender\": \"female\",\n" +
                "      \"name\": {\n" +
                "        \"title\": \"Miss\",\n" +
                "        \"first\": \"Marilyn\",\n" +
                "        \"last\": \"James\"\n" +
                "      },\n" +
                "      \"location\": {\n" +
                "        \"street\": {\n" +
                "          \"number\": 8650,\n" +
                "          \"name\": \"Prospect Rd\"\n" +
                "        },\n" +
                "        \"city\": \"Tacoma\",\n" +
                "        \"state\": \"Texas\",\n" +
                "        \"country\": \"United States\",\n" +
                "        \"postcode\": 52360,\n" +
                "        \"coordinates\": {\n" +
                "          \"latitude\": \"86.1344\",\n" +
                "          \"longitude\": \"3.3500\"\n" +
                "        },\n" +
                "        \"timezone\": {\n" +
                "          \"offset\": \"-12:00\",\n" +
                "          \"description\": \"Eniwetok, Kwajalein\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"email\": \"marilyn.james@example.com\",\n" +
                "      \"login\": {\n" +
                "        \"uuid\": \"a720daed-79b7-42be-a5a1-97cea048a740\",\n" +
                "        \"username\": \"beautifulmeercat516\",\n" +
                "        \"password\": \"password\",\n" +
                "        \"salt\": \"JSEiU3Ou\",\n" +
                "        \"md5\": \"ac8016ba7dbab85f6f66dc49c4794b71\",\n" +
                "        \"sha1\": \"606ac57953b0bc0fe875c20ba775fddbe19f28eb\",\n" +
                "        \"sha256\": \"2ad896d6d05f2ae6ba3061ee2ce00abcb782411b12d680f6a53a9627b8e79494\"\n" +
                "      },\n" +
                "      \"dob\": {\n" +
                "        \"date\": \"1986-03-20T00:17:32.580Z\",\n" +
                "        \"age\": 34\n" +
                "      },\n" +
                "      \"registered\": {\n" +
                "        \"date\": \"2018-02-22T03:52:34.663Z\",\n" +
                "        \"age\": 2\n" +
                "      },\n" +
                "      \"phone\": \"(025)-642-0815\",\n" +
                "      \"cell\": \"(976)-508-1170\",\n" +
                "      \"id\": {\n" +
                "        \"name\": \"SSN\",\n" +
                "        \"value\": \"485-02-9147\"\n" +
                "      },\n" +
                "      \"picture\": {\n" +
                "        \"large\": \"https://randomuser.me/api/portraits/women/65.jpg\",\n" +
                "        \"medium\": \"https://randomuser.me/api/portraits/med/women/65.jpg\",\n" +
                "        \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/65.jpg\"\n" +
                "      },\n" +
                "      \"nat\": \"US\"\n" +
                "    },\n" +
                "{\n" +
                "      \"gender\": \"female\",\n" +
                "      \"name\": {\n" +
                "        \"title\": \"Miss\",\n" +
                "        \"first\": \"Dorle\",\n" +
                "        \"last\": \"Storz\"\n" +
                "      },\n" +
                "      \"location\": {\n" +
                "        \"street\": {\n" +
                "          \"number\": 6578,\n" +
                "          \"name\": \"Birkenstraße\"\n" +
                "        },\n" +
                "        \"city\": \"Schwäbisch Gmünd\",\n" +
                "        \"state\": \"Thüringen\",\n" +
                "        \"country\": \"Germany\",\n" +
                "        \"postcode\": 90612,\n" +
                "        \"coordinates\": {\n" +
                "          \"latitude\": \"-42.1980\",\n" +
                "          \"longitude\": \"150.1896\"\n" +
                "        },\n" +
                "        \"timezone\": {\n" +
                "          \"offset\": \"+5:00\",\n" +
                "          \"description\": \"Ekaterinburg, Islamabad, Karachi, Tashkent\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"email\": \"dorle.storz@example.com\",\n" +
                "      \"login\": {\n" +
                "        \"uuid\": \"3d0ba2cf-ec1e-43b6-ba7d-7ac35760e99e\",\n" +
                "        \"username\": \"ticklishkoala699\",\n" +
                "        \"password\": \"jubilee\",\n" +
                "        \"salt\": \"Xe4lRATO\",\n" +
                "        \"md5\": \"db97ab4f054f2dfd176cd86e9fd7167e\",\n" +
                "        \"sha1\": \"7237f2961cd97b5da89ed9d20d7dbbd6411e0ce0\",\n" +
                "        \"sha256\": \"9b7ce2e859e2ce2cae4620d8e452c9b453751b6e5800b48d361f7a89189225b4\"\n" +
                "      },\n" +
                "      \"dob\": {\n" +
                "        \"date\": \"1988-06-13T13:11:37.940Z\",\n" +
                "        \"age\": 32\n" +
                "      },\n" +
                "      \"registered\": {\n" +
                "        \"date\": \"2006-07-22T09:58:20.698Z\",\n" +
                "        \"age\": 14\n" +
                "      },\n" +
                "      \"phone\": \"0430-8658075\",\n" +
                "      \"cell\": \"0179-7051700\",\n" +
                "      \"id\": {\n" +
                "        \"name\": \"\",\n" +
                "        \"value\": null\n" +
                "      },\n" +
                "      \"picture\": {\n" +
                "        \"large\": \"https://randomuser.me/api/portraits/women/34.jpg\",\n" +
                "        \"medium\": \"https://randomuser.me/api/portraits/med/women/34.jpg\",\n" +
                "        \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/34.jpg\"\n" +
                "      },\n" +
                "      \"nat\": \"DE\"\n" +
                "    },\n" +
                "{\n" +
                "      \"gender\": \"female\",\n" +
                "      \"name\": {\n" +
                "        \"title\": \"Mrs\",\n" +
                "        \"first\": \"Amalie\",\n" +
                "        \"last\": \"Johansen\"\n" +
                "      },\n" +
                "      \"location\": {\n" +
                "        \"street\": {\n" +
                "          \"number\": 6431,\n" +
                "          \"name\": \"Krogen\"\n" +
                "        },\n" +
                "        \"city\": \"Klitmøller\",\n" +
                "        \"state\": \"Syddanmark\",\n" +
                "        \"country\": \"Denmark\",\n" +
                "        \"postcode\": 79536,\n" +
                "        \"coordinates\": {\n" +
                "          \"latitude\": \"-28.9443\",\n" +
                "          \"longitude\": \"156.9775\"\n" +
                "        },\n" +
                "        \"timezone\": {\n" +
                "          \"offset\": \"+4:00\",\n" +
                "          \"description\": \"Abu Dhabi, Muscat, Baku, Tbilisi\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"email\": \"amalie.johansen@example.com\",\n" +
                "      \"login\": {\n" +
                "        \"uuid\": \"046aa75e-c2cb-4e6d-9810-a8e388211b1d\",\n" +
                "        \"username\": \"angryostrich563\",\n" +
                "        \"password\": \"beaches\",\n" +
                "        \"salt\": \"jUS6yYwG\",\n" +
                "        \"md5\": \"c6871d1598684f1d116496bb68087094\",\n" +
                "        \"sha1\": \"81b192688f5ba3ba84510ed397d0f270593b1aa9\",\n" +
                "        \"sha256\": \"9f99088cccf0abb43d8efe6e350d152f8104a58adb32ac99d4a71c087877d85f\"\n" +
                "      },\n" +
                "      \"dob\": {\n" +
                "        \"date\": \"1992-03-31T10:54:06.346Z\",\n" +
                "        \"age\": 28\n" +
                "      },\n" +
                "      \"registered\": {\n" +
                "        \"date\": \"2005-12-25T11:35:20.600Z\",\n" +
                "        \"age\": 15\n" +
                "      },\n" +
                "      \"phone\": \"51117189\",\n" +
                "      \"cell\": \"93430142\",\n" +
                "      \"id\": {\n" +
                "        \"name\": \"CPR\",\n" +
                "        \"value\": \"310392-9045\"\n" +
                "      },\n" +
                "      \"picture\": {\n" +
                "        \"large\": \"https://randomuser.me/api/portraits/women/52.jpg\",\n" +
                "        \"medium\": \"https://randomuser.me/api/portraits/med/women/52.jpg\",\n" +
                "        \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/52.jpg\"\n" +
                "      },\n" +
                "      \"nat\": \"DK\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return json;

    }

}
