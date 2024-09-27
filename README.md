# Springboot-Invoice-Dependency-Injection

Proyecto de Spring Boot para practicar la inyección de dependencias mediante un ejemplo de una factura. El proyecto incluye clases que representan productos, items, clientes y la factura, utilizando buenas prácticas y configuración en Spring Boot.

## Descripción

El proyecto simula la generación de una factura (`Invoice`) que contiene una lista de items (`Item`). Cada `Item` está compuesto por un `Product` y una cantidad específica. Además, la factura está asociada a un cliente (`Client`). Se hace uso de Spring Boot para gestionar la inyección de dependencias y la configuración de estos componentes.

## Estructura del Proyecto

- **Modelos (Models)**: 
  - `Product`: Representa un producto con nombre y precio.
  - `Item`: Representa el detalle de un producto en la factura, incluyendo la cantidad y el producto.
  - `Client`: Representa al cliente de la factura, con nombre y apellido.
  - `Invoice`: La factura, que contiene una lista de items y está asociada a un cliente.

- **Controlador (Controller)**:
  - `InvoiceController`: Controlador REST para mostrar la información de la factura generada.

- **Configuración (AppConfig)**:
  - Se utiliza para definir los beans de los items de la factura y cargar configuraciones desde un archivo `data.properties`.

## Archivos de Configuración

- **data.properties**:
  Este archivo contiene datos para el cliente y la descripción de la factura. 

## Dependencias
Este proyecto utiliza las siguientes dependencias:

Spring Boot Starter Web: Para el desarrollo de la aplicación REST.
Spring Boot Starter: Core del proyecto de Spring Boot.

