## Getting Started

Proyecto en Java de ejemplo del patron de diseño `Mediator`. El ejemplo se basa un escenario de una empresa de envios y entregas.

Se reduce el acomplamento entre los actores del sistema de entrega por medio del mediador que maneja el proceso de envio y notificación de mensajes entre clases que permiten completar un envio. Por lo cual, se cuenta con tres actores: Repartidor, Empacador, Almacenador y el actor intermediario mediador que entrega y recibe los mensajes que se generan en el proceso de envios.

Adicionalmente el proyecto utilizo el patron `decorator`.

La empresa inicialmente realizaba entregas basicas y tenia una clase concreta para el proceso de la entrega. A lo cual se decidio utilizar el patron de diseño decorator, debido a que el area de innovación solicito la creación de nuevos modelos de entrega sin que se afectara la funcionalidad ya construida. En el ejemplo se muestra los dos nuevos mecanismos de entrega: Entrega rapida y Entrega protegida

## Class Diagram

<img src="./src/main/resources/classDiagram.svg">

## Folder Structure

El espacio de trabajo esta comprendido por:

- `src`: the folder to maintain sources
- `resources`: the folder to maintain additional files, documentations

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
