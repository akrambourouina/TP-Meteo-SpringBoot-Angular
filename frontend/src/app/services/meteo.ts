import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ReponseMeteo } from '../models/reponse-meteo';


@Injectable({
  providedIn: 'root',
})
export class MeteoService {
  apiURL = 'http://localhost:8080/api/meteo/ville';
  
  constructor(private http: HttpClient) {

   }
  getMeteo(ville: string) {
    return this.http.get<ReponseMeteo>(this.apiURL + '/' + ville); 
  }
}
