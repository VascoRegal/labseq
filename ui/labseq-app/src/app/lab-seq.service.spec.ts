import { TestBed } from '@angular/core/testing';

import { LabSeqService } from './lab-seq.service';

describe('LabSeqService', () => {
  let service: LabSeqService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LabSeqService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
