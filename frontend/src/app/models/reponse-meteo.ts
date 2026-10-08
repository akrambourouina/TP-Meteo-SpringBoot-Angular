import { Meteo } from "./meteo";
import { Prevision } from "./prevision";

export class ReponseMeteo {
    latitude? : number;
    longitude? : number;
    current? : Meteo;
    daily? : Prevision;
}