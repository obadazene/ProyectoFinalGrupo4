import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from '../persona'
import {PersonaService} from '../persona.service'
@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {

personas: Persona[];

  constructor(private router: Router, private personaService:PersonaService) { }

  ngOnInit() {
    this.personaService.findPersona().subscribe(data =>{

      this.personas = data;
    })
  }

deletePersona(persona:Persona):void{
this.personaService.delPersona(persona)
.subscribe(data =>{

  this.personas =this.personas.filter(p => p !== persona);
})


}



}
