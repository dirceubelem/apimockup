package mockup;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("")
public class ServiceApp {

    @POST
    @Path("auth")
    public String auth() {
        return "{\"token\":\"xxxx\",\"avatar\":\"https://mockup.fluo.site/avatar/7.png\",\"select\":1,\"name\":\"Mockup\"}";
    }

    @GET
    @Path("dashboard")
    public String dashboard() {
        return "{\"balance\":{\"balance_anticipation\":191292.41,\"balance_available\":60692.860000000001,\"balance_pending\":217665.91},\"dashboard\":{\"today_value\":463.69999999999999,\"today_count\":1,\"yesterday_value\":645.96000000000004,\"yesterday_count\":2,\"this_month_count\":535,\"this_month\":175062.70000000001,\"last_month\":440128.75,\"last_month_count\":1043,\"total_balance\":278358.77000000002,\"today_billet_count\":13,\"today_billet_value\":3819.7800000000002,\"today_billet_paid_count\":0,\"today_billet_paid_value\":0,\"yesterday_billet_count\":9,\"yesterday_billet_value\":1663.6700000000001,\"yesterday_billet_paid_count\":0,\"yesterday_billet_paid_value\":0},\"dashboardComissionThisMonth\":{\"graphic\":[{\"day\":22,\"date\":\"22\\/08\\/2019\",\"cms_value\":31506.130000000001},{\"day\":23,\"date\":\"23\\/08\\/2019\",\"cms_value\":16189.74},{\"day\":24,\"date\":\"24\\/08\\/2019\",\"cms_value\":6672.7299999999996},{\"day\":25,\"date\":\"25\\/08\\/2019\",\"cms_value\":8021},{\"day\":26,\"date\":\"26\\/08\\/2019\",\"cms_value\":5679.5500000000002},{\"day\":27,\"date\":\"27\\/08\\/2019\",\"cms_value\":5134.75},{\"day\":28,\"date\":\"28\\/08\\/2019\",\"cms_value\":21718.009999999998}],\"max_value\":31506.130000000001},\"dashboardData\":{\"graphic\":[{\"day\":22,\"date\":\"22\\/08\\/2019\",\"cms_value\":31506.130000000001},{\"day\":23,\"date\":\"23\\/08\\/2019\",\"cms_value\":16189.74},{\"day\":24,\"date\":\"24\\/08\\/2019\",\"cms_value\":6672.7299999999996},{\"day\":25,\"date\":\"25\\/08\\/2019\",\"cms_value\":8021},{\"day\":26,\"date\":\"26\\/08\\/2019\",\"cms_value\":5679.5500000000002},{\"day\":27,\"date\":\"27\\/08\\/2019\",\"cms_value\":5134.75},{\"day\":28,\"date\":\"28\\/08\\/2019\",\"cms_value\":21718.009999999998}],\"max_value\":31506.130000000001}}";
    }


}
