package com.iad.sigeba.ui.automi.crudcliente;

import com.iad.sigeba.ui.automi.Event;
import com.iad.sigeba.ui.automi.State;

public class AutomaCrudCliente implements State {

    private State stato;
    private AutomaCrudClienteManageable gui;

    public AutomaCrudCliente(AutomaCrudClienteManageable gui) {
        this.gui = gui;
    }

    @Override
    public void next(Event ev) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class AttesaFiltroState implements State {

        @Override
        public void next(Event ev) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    private class VisualizzazioneRisultatiRicercaState implements State {

        @Override
        public void next(Event ev) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    private class CompilazioneDistintaVersamentoState implements State {

        @Override
        public void next(Event ev) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }
}
