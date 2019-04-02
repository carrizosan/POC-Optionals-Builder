# POC-Optionals-Builder

No termino de entender el concepto de Optionals y builder.
El optional reemplaza a las excepciones? Si uso excepciones
y voy al catch, no llego a la verificacion del optional.
Y si comento el manejo de excepciones si puedo usarlos.

Por otro lado el builder no me quedo claro el porque es una
clase dentro de otra, y porque igualmente tienen constructores
ya que habia entendido que no se usaban si se usaba builder.

**Esto me imprime solo la ciudad, cual seria la forma correcta
de que imprima todos los datos del evento, ademas del 'sin ciudad'
del orelse?

System.out.println(message.map(Event::getLocation)
                                    .map(Location::getCity)
                                    .map(City::getName)
                                    .orElse("Sin ciudad"));