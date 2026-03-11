import { Component, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

interface Torneo {
  id: string;
  nombre: string;
  fechaInicio: string;
  fechaFin: string;
  equiposInscritos: number;
  equiposTotal: number;
  costoPorEquipo: number;
  estado: 'Activo' | 'Borrador' | 'En proceso' | 'Finalizado';
}

type Tab = 'Todos' | 'Activos' | 'Finalizados';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent {
  activeTab = signal<Tab>('Todos');
  tabs: Tab[] = ['Todos', 'Activos', 'Finalizados'];
  torneos = signal<Torneo[]>([]);

  /* torneos = signal<Torneo[]>([
    {
      id: '1',
      nombre: 'Copa ECI 2026',
      fechaInicio: '20 Abr 2026',
      fechaFin: '26 Abr 2026',
      equiposInscritos: 4,
      equiposTotal: 10,
      costoPorEquipo: 100000,
      estado: 'Activo',
    }
  ]);**/

  constructor(private router: Router) {}

  get filtrados() {
    const tab = this.activeTab();
    if (tab === 'Activos')     return this.torneos().filter(t => t.estado === 'Activo');
    if (tab === 'Finalizados') return this.torneos().filter(t => t.estado === 'Finalizado');
    return this.torneos();
  }

  get stats() {
    return {
      total:       this.torneos().length,
      activos:     this.torneos().filter(t => t.estado === 'Activo').length,
      finalizados: this.torneos().filter(t => t.estado === 'Finalizado').length,
    };
  }

  setTab(tab: Tab) { this.activeTab.set(tab); }

  irACrear() { this.router.navigate(['/torneo/crear']); }
}
