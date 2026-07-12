public abstract class PlanesDatosFactory {
    public PlanDatos calculoConsumo (String tipo, int numeroMegasConsumo) {
        PlanDatos plan;

        plan = crearPlanDatos(tipo);

        plan.preparar();
        float total = plan.calculoPago(numeroMegasConsumo);
        System.out.println("Resultado: Consumo de MB" + numeroMegasConsumo + "Recibo: S/" + total);
        return plan;
    }
    protected abstract PlanDatos crearPlanDatos(String tipo);
}
