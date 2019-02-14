import { Injectable } from '@angular/core';
import {Persona} from './persona';
import { HttpClient, HttpHeaders } from '@angular/common/http';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  constructor(private http:HttpClient) {}

  private personUrl = 'http://localhost:8080/user-portal/users';
  //private userUrl = '/api';

  public findPersona() {
    return this.http.get<Persona[]>(this.personUrl);
  }

  public delPersona(persona) {
    return this.http.delete(this.personUrl + "/"+ persona.id);
  }

  public addPersona(persona) {
    return this.http.post<Persona>(this.personUrl, persona);
  }
}
