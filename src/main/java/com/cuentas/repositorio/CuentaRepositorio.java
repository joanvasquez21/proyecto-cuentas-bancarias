package com.cuentas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuentas.modelo.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {
}
