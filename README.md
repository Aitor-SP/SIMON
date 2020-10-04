# SIMON 

## ¿Cómo se compila? 🔧
```bash
# Ir a la carpeta origen del proyecto (src)
$ cd SIMON/src

# Compilar la clase Main
$ javac SIMON/src/Main.java

# Ejecutar la clase Main
$ java Main
```
## ¿Cómo funciona el BufferedReader? 📋
```bash
# Se ubica en la clase HallFame.java
# Se ejecuta al interactuar directamente con esta clase

$ Lee las líneas de texto del archivo HallFame.txt

$ Si no encuentra el archivo HallFame.txt printea un error informativo
```
## ¿Cómo funciona el BufferedWritter? 📋
```bash
# Se ubica en la clase Main.java
# Se ejecuta cuando el usuario completa el nivel 9

$ Con el parámetro append(true) añadimos líneas de texto al archivo en lugar de sobrescribir
$ El jugador ingresa su nombre/Nick y lo guarda con un salto de línea en el archivo HallFame.txt

$ Si no existe el archivo HallFame.txt lo crea automáticamente
```