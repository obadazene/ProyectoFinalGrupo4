import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { PersonaComponent } from './persona/persona.component';
import { AppRoutingModule } from './app.routing.module'
import {PersonaService} from './persona.service';
import {HttpClientModule} from "@angular/common/http";
import {AddPersonaComponent} from  './persona/add-persona.component';
@NgModule({
  declarations: [
    AppComponent,
    PersonaComponent,
    AddPersonaComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    
  ],
  providers: [PersonaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
