import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LabSeqResponse } from './lab-seq-response';
import { environment } from '../environment';

@Injectable({
  providedIn: 'root'
})
export class LabSeqService {

  constructor(private http: HttpClient) { }

  calculateLabSeq(n: number) : Observable<LabSeqResponse> {
    return this.http.get<LabSeqResponse>(environment.API_URL + "/labseq/" + n);
  }
}
