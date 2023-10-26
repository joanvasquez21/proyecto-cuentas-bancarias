# Cuenta bancaria web - Aplicación Bancaria con Spring Boot y JoinFaces

![GitHub](https://img.shields.io/badge/GitHub-Searcher-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Backend-green)
![JoinFaces](https://img.shields.io/badge/JoinFaces-Frontend-red)

Mi proyecto es una aplicación web desarrollada en Spring Boot con la interfaz de usuario creada usando JoinFaces. Esta aplicación funciona como un banco, donde los usuarios pueden realizar varias acciones como ver su saldo, editar su información, eliminar su cuenta, y agregar nuevos usuarios. Además, la aplicación gestiona una base de datos para almacenar la información de los usuarios.

## Cómo funciona

1. **Ver tipo de cuenta:** Los usuarios pueden visualizar el tipo de cuenta bancaria

2. **Ver Saldo:** Los usuarios pueden ver el saldo en sus cuentas bancarias.

3. **Editar Información:** Los usuarios tienen la capacidad de editar su información personal, como el dinero, tipo de cuenta, etc.

4. **Eliminar Cuenta:** Los usuarios pueden optar por eliminar su cuenta si lo desean.

5. **Agregar Nuevo Usuario:** Se puede agregar nuevos usuarios a la aplicación.

## Requisitos

Antes de ejecutar la aplicación, asegúrate de tener instalados los siguientes requisitos:

- [Java 21+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Base de Datos (por ejemplo, MySQL)](https://www.mysql.com/)

## Imagen
![image](https://github.com/joanvasquez21/proyecto-cuentas-bancarias/assets/70104624/d0d5922f-d612-4208-a7c1-e2d488c6f437)

## Arquitectura

[Uploading proyecto02-banco-informacion.drawio…]()
<mxfile host="Electron" modified="2023-10-26T11:59:50.880Z" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) draw.io/22.0.3 Chrome/114.0.5735.289 Electron/25.8.4 Safari/537.36" etag="PiCL9kQYAQ2eGtLgmBa-" version="22.0.3" type="device">
  <diagram name="Page-1" id="P3KzyMbeyM1C67qDE5rj">
    <mxGraphModel dx="1195" dy="697" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-2" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;" edge="1" parent="1" source="vF-zPwgiEUFZUFrdmV-c-1" target="vF-zPwgiEUFZUFrdmV-c-9">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="280" y="375" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-1" value="&lt;h2&gt;PRESENTACIÓN&lt;br&gt;(primefaces(4))&lt;/h2&gt;" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="10" y="335" width="180" height="80" as="geometry" />
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-13" value="" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;" edge="1" parent="1" source="vF-zPwgiEUFZUFrdmV-c-9" target="vF-zPwgiEUFZUFrdmV-c-11">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-9" value="&lt;h2&gt;SERVICIO&lt;br&gt;(spring(3))&lt;/h2&gt;" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="220" y="335" width="180" height="80" as="geometry" />
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-15" value="" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;" edge="1" parent="1" source="vF-zPwgiEUFZUFrdmV-c-11" target="vF-zPwgiEUFZUFrdmV-c-14">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-14" value="&lt;h2&gt;ENTIDAD(1)&lt;/h2&gt;" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="425" y="470" width="180" height="80" as="geometry" />
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-16" value="&lt;h2&gt;cuentasdb&lt;/h2&gt;" style="shape=cylinder3;whiteSpace=wrap;html=1;boundedLbl=1;backgroundOutline=1;size=15;" vertex="1" parent="1">
          <mxGeometry x="700" y="320" width="100" height="170" as="geometry" />
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-22" value="" style="endArrow=classic;html=1;rounded=0;entryX=0;entryY=0.159;entryDx=0;entryDy=0;entryPerimeter=0;exitX=0.989;exitY=0.163;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="1" source="vF-zPwgiEUFZUFrdmV-c-11" target="vF-zPwgiEUFZUFrdmV-c-16">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="570" y="400" as="sourcePoint" />
            <mxPoint x="620" y="350" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-23" value="" style="endArrow=classic;html=1;rounded=0;exitX=-0.02;exitY=0.37;exitDx=0;exitDy=0;exitPerimeter=0;entryX=1.002;entryY=0.605;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="vF-zPwgiEUFZUFrdmV-c-16" target="vF-zPwgiEUFZUFrdmV-c-11">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="710" y="378" as="sourcePoint" />
            <mxPoint x="600" y="380" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="vF-zPwgiEUFZUFrdmV-c-11" value="&lt;h2&gt;REPOSITORIO&lt;br&gt;(spring(2))&lt;/h2&gt;" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="425" y="335" width="180" height="80" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>

