import { Routes } from '@angular/router';
import { CrearTorneoComponent } from './features/organizador/crear-torneo/crearTorneo.component';

export const routes: Routes = [
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  { path: 'dashboard', loadComponent: () => import('./features/organizador/dashboard/dashboard.component').then(m => m.DashboardComponent) },
  { path: 'torneo/crear', component: CrearTorneoComponent },
];
