package com.iad.sigeba.ui.automi.uiversamento;

import com.iad.sigeba.ui.automi.Event;
import com.iad.sigeba.ui.automi.State;
import com.iad.sigeba.ui.automi.crudcliente.AnnullaEvent;
import com.iad.sigeba.ui.automi.crudcliente.AutomaCrudClienteManageable;

public class AutomaUIVersamento implements State {

	private State stato;
	private AutomaCrudClienteManageable gui;

	public AutomaUIVersamento(AutomaCrudClienteManageable gui) {
		this.gui = gui;
		stato = new AttesaFiltroState();
	}

	@Override
	public void next(Event ev) {
		stato.next(ev);
	}

	private class AttesaFiltroState implements State {

		public AttesaFiltroState() {
			gui.setClientePanel(false);
			gui.setSearchPanel(true);
			gui.setTabellaClienti(false);
		}

		@Override
		public void next(Event ev) {
			if (ev instanceof CercaEvent) {
				stato = new VisualizzazioneRisultatiRicercaState();
			} else {
				System.out.println("Errore!");
			}
		}
	}

	private class VisualizzazioneRisultatiRicercaState implements State {

		public VisualizzazioneRisultatiRicercaState() {
			gui.setClientePanel(true);
			gui.setSearchPanel(true);
			gui.setTabellaClienti(false);
		}

		@Override
		public void next(Event ev) {
			if (ev instanceof VersamentoEvent) {
				stato = new CompilazioneDistintaVersamentoState();
			} else if (ev instanceof CercaEvent) {
				// niente da fare, rimane sullo stato
			} else {
				System.out.println("Errore!");
			}
		}
	}

	private class CompilazioneDistintaVersamentoState implements State {

		public CompilazioneDistintaVersamentoState() {
			gui.setClientePanel(false);
			gui.setSearchPanel(false);
			gui.setTabellaClienti(true);
		}

		@Override
		public void next(Event ev) {
			if (ev instanceof AnnullaEvent) {
				stato = new AttesaFiltroState();
			} else if (ev instanceof VersaEvent) {
				stato = new AttesaFiltroState();
			} else {
				System.out.println("Errore!");
			}
		}
	}
}