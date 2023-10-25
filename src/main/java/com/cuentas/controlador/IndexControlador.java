package com.cuentas.controlador;

import java.util.List;

import org.joinfaces.autoconfigure.primefaces.PrimefacesAutoConfiguration.Primefaces10_0_0AutoConfiguration;
import org.primefaces.PrimeFaces;
import org.primefaces.expression.impl.ThisExpressionResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cuentas.modelo.Cuenta;
import com.cuentas.servicio.CuentaServicio;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.FacesComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;

@Component
@Data
@ViewScoped
public class IndexControlador {

	@Autowired
	CuentaServicio cuentaServicio;

	private List<Cuenta> cuentas;

	private Cuenta cuentaSeleccionada;

	private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

	// Despues de que se crea este objeto, cargaremos toda la lista de objeto de
	// tipo cuenta de la bd
	@PostConstruct
	public void init() {
		cargarDatos();
	}

	public void cargarDatos() {
		this.cuentas = cuentaServicio.listarCuentas();
		cuentas.forEach((cuenta) -> logger.info(cuenta.toString()));
	}

	public void agregarCuenta() {
		this.cuentaSeleccionada = new Cuenta();

	}

	public void guardarCuenta() {
		logger.info("Cuenta a guardar: " + this.cuentaSeleccionada);

		// Agregar
		if (this.cuentaSeleccionada.getIdCuenta() == null) {
			this.cuentaServicio.guardarCuenta(cuentaSeleccionada);
			this.cuentas.add(cuentaSeleccionada);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cuenta agregada"));
		} else {
		// Modificar(update)
			this.cuentaServicio.guardarCuenta(this.cuentaSeleccionada);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se edito correctamente"));

		}

		// Ocultamos la ventana
		PrimeFaces.current().executeScript("PF('ventanaModalCuenta').hide()");
		// Actualizamos la ventana
		PrimeFaces.current().ajax().update("forma-cuentas:mensajes", "forma-cuentas:cuentas-tabla");
	}

	public void eliminarCuenta() {
		cuentaServicio.eliminarCuenta(this.cuentaSeleccionada);
		// Eliminar el registro de la lista de cuentas
		this.cuentas.remove(this.cuentaSeleccionada);
		// Resetamos el atributo de cuenta seleccionada
		this.cuentaSeleccionada = null;
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cuenta eliminada"));
		PrimeFaces.current().ajax().update("forma-cuentas:mensajes", "forma-cuentas:cuentas-tabla");

	}

}
