import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckbookRequestsComponent } from './checkbook-requests.component';

describe('CheckbookRequestsComponent', () => {
  let component: CheckbookRequestsComponent;
  let fixture: ComponentFixture<CheckbookRequestsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CheckbookRequestsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckbookRequestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
