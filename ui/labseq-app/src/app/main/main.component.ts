import { Component } from '@angular/core';
import { LabSeqResponse } from '../lab-seq-response';
import { LabSeqService } from '../lab-seq.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule,
    RouterOutlet,
    RouterLink,
    RouterLinkActive
  ],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})

export class MainComponent {
  n: number | null = null;
  resultsList: LabSeqResponse[] = [];

  constructor(private service: LabSeqService) {}

  calculateResult() : void {
    if (this.n != null) {
      console.log("Calculating with n = " + this.n);
      this.service.calculateLabSeq(this.n).subscribe((res) => this.resultsList.push(res));
    }
  }
}
