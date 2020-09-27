import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChequeBookRequestComponent } from './cheque-book-request.component';

describe('ChequeBookRequestComponent', () => {
  let component: ChequeBookRequestComponent;
  let fixture: ComponentFixture<ChequeBookRequestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChequeBookRequestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChequeBookRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
