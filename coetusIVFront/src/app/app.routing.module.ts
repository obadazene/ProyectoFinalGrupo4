import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {PersonaComponent} from './persona/persona.component'
import {AddPersonaComponent} from './persona/add-persona.component'


const routes: Routes = [
  { path: 'persona', component: PersonaComponent },
  { path: 'add', component: AddPersonaComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
