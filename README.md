Actividad Parcial: Tienda Virtual con Patrones de Diseño en Java

Este proyecto consiste en una tienda virtual desarrollada en Java por consola, donde se aplican los patrones de diseño Strategy, Adapter y Observer. El objetivo principal es demostrar cómo estos patrones ayudan a construir sistemas más organizados, flexibles y fáciles de mantener. Todo el código fue traducido al español para facilitar su comprensión y sustentación académica, siguiendo la estructura enseñada por el Msc. Ing. Eddy Miranda Velásquez.

1. Problema abordado

En muchos sistemas de ventas virtuales aparecen problemas relacionados con el acoplamiento del código y la dificultad para realizar cambios futuros. Este proyecto busca resolver tres situaciones comunes en aplicaciones reales.

El primer problema es la gestión de descuentos. Las tiendas suelen cambiar promociones constantemente, como descuentos porcentuales o montos fijos. Si toda esa lógica se programa directamente dentro de una sola clase usando muchos if o switch, el sistema se vuelve difícil de modificar y mantener.

El segundo problema es la integración de servicios externos de pago. En este caso se utiliza un servicio externo de PayPal que posee métodos distintos a los que maneja nuestro sistema. Como no podemos modificar el código externo, necesitamos una forma de adaptarlo para que funcione correctamente con nuestra tienda.

El tercer problema ocurre cuando una compra es confirmada y varios módulos deben reaccionar automáticamente, como enviar correos, actualizar inventario o notificar al administrador. Si todas esas acciones dependen directamente entre sí, el sistema se vuelve muy rígido y complicado de mantener.

2. Patrones de Diseño Aplicados
   A. Patrón Strategy

El patrón Strategy se utilizó para manejar los distintos tipos de descuentos de forma flexible. Para ello se creó la interfaz EstrategiaDescuento, la cual permite definir diferentes estrategias de cálculo sin modificar el resto del sistema.

Las clases SinDescuentoEstrategia, DescuentoPorcentualEstrategia y DescuentoMontoFijoEstrategia contienen sus propias fórmulas de descuento. La clase ServicioOrden utiliza estas estrategias mediante composición y puede cambiarlas dinámicamente usando el método setEstrategiaDescuento().

Gracias a esto, el sistema puede agregar nuevos descuentos fácilmente sin alterar el código principal.

B. Patrón Adapter

El patrón Adapter se utilizó para integrar un servicio externo de PayPal con una interfaz incompatible con nuestro sistema.

La tienda trabaja con la interfaz ProcesadorPago, que utiliza el método pagar(double monto). Sin embargo, el servicio externo ServicioPayPalExterno utiliza el método realizarPago(String moneda, double monto).

Para resolver esta diferencia se implementó la clase AdaptadorPayPal, la cual actúa como intermediaria. Esta clase traduce las llamadas del sistema y permite usar el servicio externo sin modificar su código original.

C. Patrón Observer

El patrón Observer se utilizó para manejar las notificaciones automáticas después de confirmar una compra.

Se crearon las interfaces Sujeto y ObservadorOrden, encargadas de administrar el registro y comunicación entre objetos. La clase ServicioOrden funciona como el sujeto principal y mantiene una lista de observadores registrados.

Cuando una orden es procesada exitosamente, el sistema cambia su estado y notifica automáticamente a todos los observadores. Esto provoca que se ejecuten acciones como enviar correos al cliente, actualizar el inventario y notificar al administrador.

Con este enfoque, cada módulo trabaja de manera independiente y el sistema resulta más desacoplado y fácil de mantener.

3. Resultado del Programa

Al ejecutar el programa principal Main.java, se puede observar cómo los tres patrones trabajan juntos correctamente. El sistema aplica descuentos dinámicamente, procesa pagos mediante el adaptador de PayPal y finalmente notifica automáticamente a todos los módulos registrados después de confirmar la compra.
![Captura de pantalla 2026-05-23 123137.png](../../OneDrive/Pictures/Screenshots/Captura%20de%20pantalla%202026-05-23%20123137.png)