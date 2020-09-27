import { TestBed } from '@angular/core/testing';

import { DisableService } from './disable.service';

describe('DisableService', () => {
  let service: DisableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DisableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
