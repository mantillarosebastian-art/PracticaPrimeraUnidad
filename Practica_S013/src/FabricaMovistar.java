public class FabricaMovistar extends PlanesDatosFactory {
    protected PlanDatos crearPlanDatos(String tipo) {
    PlanDatos plan = null;
    if (tipo.equals("academico") ) {
        plan = new PlanDatosAcademico( );
        plan.setTasa(0.8f);
    } else if (tipo.equals("personal") ){
        plan = new PlanDatosPersonal();
        plan.setTasa(1.6f);
    } else if (tipo.equals("negocio")){
        plan = new PlanDatosNegocio() ;
        plan.setTasa(1.25f) ;
    }

    if (plan != null ){
        plan.setProveedor("Movistar");
    }
    return plan;
    }
}
