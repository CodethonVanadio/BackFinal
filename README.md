La creación de la parte del backend ha sido realizada mediante spring boot en la versión 17 de java, por tanto para poder desplegar la aplicación es necesario seguir estos pasos

1. Instalación del JDK 17 de Nellsoft.
2. Instalación del NetBeans 17.
3. En NetBeans, ir a la pestaña Tools/Plugins. Se abrirá una ventana, dirigirse a la pestaña Downloaded/Add Plugins.
4. Buscar y seleccionar el nb-springboot-plugin.
5. Presionar el botón "Install" en la esquina inferior izquierda, seguir los pasos y reiniciar el IDE.
Cuando abras de nuevo NetBeans, podrás ver que en nuevo proyecto/Maven/new spring app.

El programa utiliza el puerto 8989, por lo que si quieres probar a hacer llamadas en local tendás que utilizar ese puerto

La función principal de la aplicacion del backend es devolver la información extraída  de la API de https://openchargemap.org/site, filtrar y ordenar toda esa información para sacar solo los datos que nos interesan y devolver la información dependiendo de los parámtetros de latitud y longitud tanto de origen como de destino mediante una solicitud http que envía el front para comunicarse.
Como segunda funcionalidad que hemos implementado ha sido desarrollar nuestra propia APIrest de forma que, con ella se puedan realizar las acciones CRUD,implementando una base de datos, de forma que, si en algún momento decidiésemos hacer un login funcional, nos costara mucho menos trabajo crearlo todo. 

Para esta base de datos, también están implementados los servicios de validación de parámetros con control de excepciones para no recibir parámtros incorrectos o nulos, búsqueda por similitud y consultas personalizadas
El proyecto además está estructurado de forma que servicios ,entidades y métodos estén separados en paquetes, de manera que, su escalabilidad , su flexibilidad y su resiliencia a fallos son mucho mayores que con una estructura de proyecto común.
Por úñtimo explicar un par de cosas que me gustaría haber implementado a tiempo:
Me gustaría haber implemetado en mi proyecto una la base de datos de PostgreSQL para ello (pero me daba unos errores a la hora de subirlo a render que no se solucionar por el momento) y también implementar usos de la capa de acceso a datos.
