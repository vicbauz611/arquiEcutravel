/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ecutravel.asoaerolineas.ws;

import ec.edu.espe.ecutravel.asoaerolineas.controllers.AerolineaController;
import ec.edu.espe.ecutravel.asoaerolineas.entities.Aerolinea;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Vicho
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    @EJB
    private AerolineaController ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "getAerolineas")
    public List<Aerolinea> getAerolineas() {
        return ejbRef.getAerolineas();
    }
    @WebMethod(operationName = "getCiudades")
    public List<aerolineaconsumer.consumer.Ciudad> getCiudades() {
        return aerolineaconsumer.AerolineaWSConsumer.obtenerCiudades();
    }
    
}
