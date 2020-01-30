**SimuDuck-APP**  
A continuacion se lista las ramas que se fueron creando y cada rama contiene un respectivo
hito del proyecto.  
**1.- 2019012229-create-basic-structure**  
En esta rama se creo la estructura basica del proyecto

**2.- 202001292244-create-simu-duckapp**    
Seguidamente se creo la super clase duck y dos clases hijas que heredaran comportamientos comunes.

**3.- 202001292254-adding-fly-method**  
En este punto se agrego el metodo fly en la super clase Pato, lo cual ha provocado que dicho metodo 
sea heredado a todas las clases hijas provocando comportamientos no deseados

**4.- 202001292301-adding-rubberduck**  
A continuacion se agrego la clase RubberDuck, obviamente esta clase heredo todos los metodos de la clase padre,
e incluso los comportamientos no deseados y para solucionar este problema se incurrio en la implementacion de codigo viscoso.

**5.- 202001292312-adding-Decoy-duck**  
Al igual que la anterior clase fue mas evidente la busqueda inmediata de una mejor solucion a la de sobreescribir las clases con
metodos vacios


**6.- 202001292320-adding-flyable-quackable-interfaces**   
Una primera alternativa fue crear interfaces que contengan la firma de los metodos que se desea implementar en las 
clases correspondientes, de tal manera que el codigo sea mas mantenible y limpio, pero esta solucion tampoco es la mas ideal porque 
modificar el comportamiento de los patos o sus cualidades en tiempo de ejecucion es rigido

**7.- 202001292334-implementing-the-duck-behaviors**  
Entonces se penso mejor en lugar de crear interfaces, simplemente implementar comportamientos genericos de los patos, de tal manera
que los comportamientos especializados implementen sus propios comportamientos

**8.- 202001292341-integrating-the-duck-behavior**  
En este hito se empezo con la integracion de la nueva solucion y la refactorizacion de las clases.

**9.- 202001292359-more-integrations**
En este hito se continuo integrando la nueva logica de tal manera de que el codigo sea mas escalable y permita agregar nuevos
tipos de patos y ademas nuevos tipos de comportamientos

**10.- 202001300014-setting-behavior-dinamically**  
Se agrego los metodos necesarios para cambiar los comportamientos de los patos dinamicamente en la super clase Pato

**11.- 202001300025-refactoring-the-project**  
finalmente se refactorizo todo el proyecto y se hizo las implementaciones restantes 
