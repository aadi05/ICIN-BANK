import { TestBed } from '@angular/core/testing';

import { TransferhistoryService } from './transferhistory.service';

describe('TransferhistoryService', () => {
  let service: TransferhistoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TransferhistoryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
