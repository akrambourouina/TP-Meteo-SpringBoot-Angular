import { Component } from '@angular/core';
import { MeteoService } from '../services/meteo.services';
import { ReponseMeteo } from '../models/reponse-meteo';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-meteo',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './meteo.html',
  styleUrl: './meteo.css',
})
export class Meteo {

  ville: string = '';
  erreur: string = '';
  reponseMeteo?: ReponseMeteo;
  constructor(private meteoService: MeteoService) {

  }

  getMeteo() {
    this.erreur = '';
    this.meteoService.getMeteo(this.ville).subscribe({

      next: (data: ReponseMeteo) => {
        this.reponseMeteo = data;
        console.log(data);
      },

      error: (err) => {
        this.reponseMeteo = undefined;

        if (err.status === 404) {
          this.erreur = 'Ville introuvable';
        } else {
          this.erreur = 'Une erreur est survenue';
        }
      }

    });
  }


}
