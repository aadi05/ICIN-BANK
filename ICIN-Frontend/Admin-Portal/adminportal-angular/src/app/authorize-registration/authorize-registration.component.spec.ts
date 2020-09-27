import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AuthorizeRegistrationComponent } from './authorize-registration.component';

describe('AuthorizeRegistrationComponent', () => {
  let component: AuthorizeRegistrationComponent;
  let fixture: ComponentFixture<AuthorizeRegistrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AuthorizeRegistrationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AuthorizeRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
