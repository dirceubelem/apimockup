package mockup;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("events")
public class ServiceEvent extends ServiceBase {

    @GET
    public String getEvents() {

        String json = "[\n" +
                "    {\n" +
                "        \"id\": 16,\n" +
                "        \"name\": \"Evento\",\n" +
                "        \"product_id\": null,\n" +
                "        \"start_event\": \"24/09/2019 17:30\",\n" +
                "        \"end_event\": \"28/09/2019 17:30\",\n" +
                "        \"instructions\": \"Instru\",\n" +
                "        \"place\": \"Local\",\n" +
                "        \"warnings\": \"Avisos\",\n" +
                "        \"organization_contact\": \"Aner\",\n" +
                "        \"user_id\": 3,\n" +
                "        \"email\": \"gustavo.apetersen@gmail.com\",\n" +
                "        \"url\": \"http://curso.teste.com.br\",\n" +
                "        \"created_at\": \"2019-09-06 20:19:45\",\n" +
                "        \"updated_at\": \"2019-09-06 20:19:45\",\n" +
                "        \"deleted_at\": null,\n" +
                "        \"send_checkin_order\": false,\n" +
                "        \"offers\": [\n" +
                "             \"GOLD\",\n" +
                "             \"VIP\",\n" +
                "             \"STANDARD\"\n" +
                "        ],\n" +
                "        \"permissions\": [\n" +
                "            \"view\",\n" +
                "            \"accredit\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 19,\n" +
                "        \"name\": \"Evento Teste\",\n" +
                "        \"product_id\": null,\n" +
                "        \"start_event\": \"29/09/2019 14:00\",\n" +
                "        \"end_event\": \"30/09/2019 14:00\",\n" +
                "        \"instructions\": \"123\",\n" +
                "        \"place\": \"123\",\n" +
                "        \"warnings\": \"123\",\n" +
                "        \"organization_contact\": \"123\",\n" +
                "        \"user_id\": 3,\n" +
                "        \"email\": \"gustavo.apetersen@gmail.com\",\n" +
                "        \"url\": \"123\",\n" +
                "        \"created_at\": \"2019-09-09 16:56:37\",\n" +
                "        \"updated_at\": \"2019-09-09 16:56:37\",\n" +
                "        \"deleted_at\": null,\n" +
                "        \"send_checkin_order\": false,\n" +
                "        \"offers\": [\n" +
                "             \"GOLD\",\n" +
                "             \"VIP\"\n" +
                "        ],\n" +
                "        \"permissions\": [\n" +
                "            \"view\",\n" +
                "            \"accredit\"\n" +
                "        ]\n" +
                "    }\n" +
                "]";

        return json;

    }

    @POST
    @Path("{id}/accredit/{qrcode}")
    public String accredit(@PathParam("id") int id, @PathParam("qrcode") String qrCode) throws Exception {
        if (id == 16 || id == 19) {

            String json = "";

            if (qrCode.equals("2KTVY3")) {

                json = "{\n" +
                        "    \"accredited\": true,\n" +
                        "    \"name\": \"Gustavo Petersen\",\n" +
                        "    \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                        "    \"document\": \"124.546.126-58\",\n" +
                        "    \"offer_name\": \"GMX GOLD\",\n" +
                        "    \"code\": \"2KTVY3\"\n" +
                        "}";

            } else if (qrCode.equals("2KTVY4")) {

                json = "{\n" +
                        "    \"accredited\": false,\n" +
                        "    \"name\": \"Gustavo Petersen\",\n" +
                        "    \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                        "    \"document\": \"124.546.126-58\",\n" +
                        "    \"offer_name\": \"GMX GOLD\",\n" +
                        "    \"code\": \"2KTVY4\"\n" +
                        "}";

            } else {
                response.sendError(404);
                return null;
            }

            return json;

        } else {
            response.sendError(404);
            return null;
        }
    }

    @GET
    @Path("{id}/attendee/{qrcode}")
    public String attendee(@PathParam("id") int id, @PathParam("qrcode") String qrCode) throws Exception {
        if (id == 16 || id == 19) {

            String json = "";

            if (qrCode.equals("2KTVY3")) {

                json = "{\n" +
                        "    \"accredited\": true,\n" +
                        "    \"name\": \"Gustavo Petersen\",\n" +
                        "    \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                        "    \"document\": \"124.546.126-58\",\n" +
                        "    \"offer_name\": \"GMX GOLD\",\n" +
                        "    \"code\": \"2KTVY3\"\n" +
                        "}";

            } else if (qrCode.equals("2KTVY4")) {

                json = "{\n" +
                        "    \"accredited\": false,\n" +
                        "    \"name\": \"Gustavo Petersen\",\n" +
                        "    \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                        "    \"document\": \"124.546.126-58\",\n" +
                        "    \"offer_name\": \"GMX GOLD\",\n" +
                        "    \"code\": \"2KTVY4\"\n" +
                        "}";

            } else {
                response.sendError(404);
                return null;
            }

            return json;

        } else {
            response.sendError(404);
            return null;
        }
    }

    @GET
    @Path("{id}/search")
    public String search(@PathParam("id") int id) throws Exception {
        if (id == 16 || id == 19) {

            String json = "[\n" +
                    "    {\n" +
                    "        \"accredited\": true,\n" +
                    "        \"name\": \"Gustavo Petersen\",\n" +
                    "        \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                    "        \"document\": \"124.546.126-58\",\n" +
                    "        \"offer_name\": \"GMX GOLD\",\n" +
                    "        \"code\": \"2KTVY3\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"accredited\": true,\n" +
                    "        \"name\": \"Gustavo Petersen\",\n" +
                    "        \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                    "        \"document\": \"124.546.126-58\",\n" +
                    "        \"offer_name\": \"GMX GOLD\",\n" +
                    "        \"code\": \"2KTVY3\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"accredited\": false,\n" +
                    "        \"name\": \"Gustavo Petersen\",\n" +
                    "        \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                    "        \"document\": \"124.546.126-58\",\n" +
                    "        \"offer_name\": \"GMX GOLD\",\n" +
                    "        \"code\": \"2KTVY3\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"accredited\": false,\n" +
                    "        \"name\": \"Gustavo Petersen\",\n" +
                    "        \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                    "        \"document\": \"124.546.126-58\",\n" +
                    "        \"offer_name\": \"GMX GOLD\",\n" +
                    "        \"code\": \"2KTVY3\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"accredited\": false,\n" +
                    "        \"name\": \"Gustavo Petersen\",\n" +
                    "        \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                    "        \"document\": \"124.546.126-58\",\n" +
                    "        \"offer_name\": \"GMX GOLD\",\n" +
                    "        \"code\": \"2KTVY3\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"accredited\": false,\n" +
                    "        \"name\": \"Gustavo Petersen\",\n" +
                    "        \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                    "        \"document\": \"124.546.126-58\",\n" +
                    "        \"offer_name\": \"GMX GOLD\",\n" +
                    "        \"code\": \"2KTVY3\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"accredited\": true,\n" +
                    "        \"name\": \"Gustavo Petersen\",\n" +
                    "        \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                    "        \"document\": \"124.546.126-58\",\n" +
                    "        \"offer_name\": \"GMX GOLD\",\n" +
                    "        \"code\": \"2KTVY3\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"accredited\": true,\n" +
                    "        \"name\": \"Gustavo Petersen\",\n" +
                    "        \"email\": \"gustavo.petersen@ticto.com.br\",\n" +
                    "        \"document\": \"124.546.126-58\",\n" +
                    "        \"offer_name\": \"GMX GOLD\",\n" +
                    "        \"code\": \"2KTVY3\"\n" +
                    "    }\n" +
                    "]";
            
            return json;

        } else {
            response.sendError(404);
            return null;
        }
    }

}
