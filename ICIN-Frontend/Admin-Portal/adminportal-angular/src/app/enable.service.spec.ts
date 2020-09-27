import { TestBed } from '@angular/core/testing';

import { EnableService } from './enable.service';

describe('EnableService', () => {
  let service: EnableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EnableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
