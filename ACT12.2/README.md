# OrangeHRM Test Automation

Este repositorio contiene la automatización de pruebas funcionales para OrangeHRM (versión demo open source) utilizando Selenium WebDriver y TestNG con Java.

🔗 Demo: [https://opensource-demo.orangehrmlive.com/](https://opensource-demo.orangehrmlive.com/)

## ✅ Casos de prueba automatizados

| ID    | Módulo       | Descripción                                      |
|-------|--------------|--------------------------------------------------|
| TC01  | Login        | Autenticación con usuario válido                 |
| TC02  | Admin - Job  | Eliminar primer título de trabajo                |
| TC03  | Admin        | Eliminar primera nacionalidad                    |
| TC04  | Organization | Cambiar nombre de empresa a “ADA ITS”           |
| TC05  | PIM          | Agregar nuevo empleado “Juan Pérez”             |
| TC06  | PIM          | Ver primer reporte haciendo clic en el ícono    |
| TC07  | PIM          | Buscar empleado por nombre                       |
| TC08  | Leave        | Consultar días asignados a “Juan”               |
| TC09  | Leave        | Ver reporte de “Alberto Ramirez Diaz”           |
| TC10  | Leave        | Asignar licencia “CAN - Maternity” con fechas   |

## ⚙️ Tecnologías usadas

- Java 17
- Maven
- Selenium WebDriver
- TestNG
- ChromeDriver

## 📷 Demostración

Test 01 :
Inicia sesión en OrangeHRM con credenciales válidas.

![GIF 1](media/Test01-ezgif.com-video-to-gif-converter.gif)

Test 02: 
Navega a Admin > Job Titles y elimina el primer título listado.

![GIF 2](media/Test02-ezgif.com-video-to-gif-converter.gif)

Test 03:
En Admin > Nationalities, elimina la primera nacionalidad.

![GIF 3](media/Test03-ezgif.com-video-to-gif-converter.gif)

Test 04:
Cambia el nombre de la empresa a ADA ITS en la sección Organization.

![GIF 4](media/Test04-ezgif.com-video-to-gif-converter.gif)

Test 05:
Agrega un nuevo empleado llamado Ricardo Ruiz Anaya en PIM > Add Employee.

![GIF 5](media/Test05-ezgif.com-video-to-gif-converter.gif)

Test 06:
En PIM > Reports, abre el primer reporte usando el ícono de vista.

![GIF 6](media/Test06-ezgif.com-video-to-gif-converter.gif)

Test 07:
Busca al empleado llamado Alberto Ramirez Diaz en la lista de empleados.

![GIF 7](media/Test07-ezgif.com-video-to-gif-converter.gif)

Test 08:
Consulta los días de licencia asignados a Alberto Ramirez Diaz.

![GIF 8](media/Test08-ezgif.com-video-to-gif-converter.gif)

Test 09:
Genera un reporte de licencias para Alberto Ramirez Diaz.

![GIF 9](media/Test09-ezgif.com-video-to-gif-converter.gif)

Test 10:
Asigna una licencia de tipo CAN - Maternity para Alberto, del 22 al 23 de mayo de 2025.

![GIF 10](media/Test10-ezgif.com-video-to-gif-converter.gif)



## 📁 Estructura del proyecto

```
orangehrm-tests/
├── src/
│   ├── main/java/
│   └── test/java/tests/
│       ├── TC01_LoginTest.java
│       ├── TC02_JobTitleTest.java
│       └── ...
├── pom.xml
└── README.md
```

## 🧾 Autor

**Alberto Ramirez Diaz**
