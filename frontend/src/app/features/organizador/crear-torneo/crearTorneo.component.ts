import { Component, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

interface TorneoForm {
  nombre: string;
  costoInscripcion: number | null;
  fechaInicio: string;
  fechaFin: string;
  estado:  'Borrador' | 'Activo' | 'En proceso' | 'Finalizado';
  cantidadEquipos: number | null;
  faseEliminatoria: boolean;
  jugadoresMin: number | null;
  jugadoresMax: number | null;
  jugadoresEnCancha: number | null;
}

@Component({
  selector: 'app-crear-torneo',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './crearTorneo.component.html',
  styleUrl: './crearTorneo.component.css'
})
export class CrearTorneoComponent {
  step = signal(1);
  showDropdown = signal(false);
  stepLabels = ['Información general', 'Configuración Equipos', 'Confirmación'];
  estadoOpts: TorneoForm['estado'][] = ['Borrador', 'Activo', 'En proceso', 'Finalizado'];

  form: TorneoForm = {
    nombre: '',
    costoInscripcion: null,
    fechaInicio: '',
    fechaFin: '',
    estado: 'Borrador',
    cantidadEquipos: null,
    faseEliminatoria: true,
    jugadoresMin: null,
    jugadoresMax: null,
    jugadoresEnCancha: null,
  };

  canContinue(): boolean {
    if (this.step() === 1) return !!this.form.nombre && !!this.form.fechaInicio && !!this.form.fechaFin;
    if (this.step() === 2) return !!this.form.cantidadEquipos;
    return true;
  }

  next()  { if (this.step() < 3 && this.canContinue()) this.step.update(s => s + 1); }
  back()  { if (this.step() > 1) this.step.update(s => s - 1); }
  toggleDropdown() { this.showDropdown.update(v => !v); }
  selectEstado(e: TorneoForm['estado']) { this.form.estado = e; this.showDropdown.set(false); }
 constructor(private router: Router) {}
  confirmar() {
    this.router.navigate(['/dashboard']);
  }
}
