/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockup;

import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * @author dirceubelem
 */
@javax.ws.rs.ApplicationPath("v1")
public class ApplicationConfig extends Application {

    public static final String APPLICATION_JSON_CHARSET_UTF8 = "application/json; charset=utf-8";

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ServiceVersion.class);
        resources.add(ServiceFeed.class);
        resources.add(ServiceAccount.class);
        resources.add(ServiceApp.class);
        resources.add(ServiceCompetition.class);

        resources.add(ServiceAmigo.class);
        resources.add(ServiceEstadio.class);
        resources.add(ServiceJogador.class);
        resources.add(ServiceProduto.class);
        resources.add(ServiceRede.class);
        resources.add(ServiceTecnico.class);
        resources.add(ServiceTime.class);
        resources.add(ServiceUsuario.class);
        resources.add(ServiceEvent.class);
        resources.add(ServiceCharacter.class);

        resources.add(ServiceName.class);
        resources.add(ServicePBH.class);

        resources.add(ServiceFriend.class);
        resources.add(ServiceStories.class);

        resources.add(ServiceMessage.class);
        resources.add(ServiceFatura.class);


    }

}
