import { TestBed } from '@angular/core/testing';

import { CheckbookService } from './checkbook.service';

describe('CheckbookService', () => {
  let service: CheckbookService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CheckbookService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
