import { Component, signal } from '@angular/core';
import { Meteo } from './meteo/meteo';

@Component({
  selector: 'app-root',
  imports: [Meteo],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  //protected readonly title = signal('meteo-front');
}
