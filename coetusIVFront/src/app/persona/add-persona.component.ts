import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from '../persona'
import {PersonaService} from '../persona.service'
@Component({
  templateUrl: './add-persona.component.html'
})
export class AddPersonaComponent {

  persona: Persona= new Persona();

  constructor(private router: Router, private personaService: PersonaService) {

  }

  createPersona(): void {
    this.personaService.addPersona(this.persona)
        .subscribe( data => {
          alert("Persona created successfully.");
        });

  };

}
