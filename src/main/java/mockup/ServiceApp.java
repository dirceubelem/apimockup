package mockup;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("")
public class ServiceApp {

    @POST
    @Path("auth")
    public String auth() {
        return "{\"token\":\"f2add724d6016115ed7b8379cfe32d0dc0140f534c63d798916be37695f0ba4b\",\"avatar\":\"https:\\/\\/app.ticto.com.br\\/assets\\/images\\/avatar.jpg\",\"select\":0,\"name\":\"Patricia Freitas\"}";
    }

    @GET
    @Path("dashboard")
    public String dashboard() {
        return "{\"balance\":{\"balance_anticipation\":3547.6999999999998,\"balance_available\":3506,\"balance_pending\":69.5},\"dashboard\":{\"today_value\":24,\"today_count\":3,\"yesterday_value\":0,\"yesterday_count\":0,\"this_month_count\":3,\"this_month\":24,\"last_month\":18.75,\"last_month_count\":3,\"total_balance\":3575.5,\"today_billet_count\":1,\"today_billet_value\":107.01000000000001,\"today_billet_paid_count\":0,\"today_billet_paid_value\":0,\"yesterday_billet_count\":0,\"yesterday_billet_value\":0,\"yesterday_billet_paid_count\":0,\"yesterday_billet_paid_value\":0,\"max_value\":24},\"dashboardComissionThisMonth\":{\"graphic\":[{\"day\":0,\"date\":\"11\\/12\\/2020\",\"cms_value\":0},{\"day\":1,\"date\":\"12\\/12\\/2020\",\"cms_value\":23},{\"day\":2,\"date\":\"13\\/12\\/2020\",\"cms_value\":300},{\"day\":3,\"date\":\"14\\/12\\/2020\",\"cms_value\":125},{\"day\":4,\"date\":\"15\\/12\\/2020\",\"cms_value\":12},{\"day\":5,\"date\":\"16\\/12\\/2020\",\"cms_value\":34},{\"day\":6,\"date\":\"17\\/12\\/2020\",\"cms_value\":190},{\"day\":7,\"date\":\"18\\/12\\/2020\",\"cms_value\":90}],\"max_value\":24},\"dashboardData\":{\"graphic\":[{\"day\":0,\"date\":\"11\\/12\\/2020\",\"cms_value\":0},{\"day\":1,\"date\":\"12\\/12\\/2020\",\"cms_value\":0},{\"day\":2,\"date\":\"13\\/12\\/2020\",\"cms_value\":0},{\"day\":3,\"date\":\"14\\/12\\/2020\",\"cms_value\":0},{\"day\":4,\"date\":\"15\\/12\\/2020\",\"cms_value\":0},{\"day\":5,\"date\":\"16\\/12\\/2020\",\"cms_value\":0},{\"day\":6,\"date\":\"17\\/12\\/2020\",\"cms_value\":0},{\"day\":7,\"date\":\"18\\/12\\/2020\",\"cms_value\":24}],\"max_value\":24}}\n";
    }


}
