# Doctor Application 
## Language and Framwork
 * Java
 * SpringBoot
 * JPA
 *  MYSQL database
 *  Swagger UI
## Data Flow
# Controller
## AdminController
* @GetMapping("patients")
* @PostMapping("doctor")
* @GetMapping("patients/bloodGroup/{bloodGroup}")
## DoctorController
* @GetMapping("doctors")
* @GetMapping("doctor/{id}")
## PatientController
*  @PostMapping("patient/signup")
* @PostMapping("patient/signIn")
* @DeleteMapping("patient/signOut")
* @PostMapping("patient/appointment/schedule")* *@DeleteMapping("patient/appointment/{appointmentId}/
  cancel")
*@GetMapping("doctors/qualification/{qual}/or/specialization/{spec}")
# Service
 ## AppointementService
 * scheduleAppointment()
 * cancelAppointment()
 ## DoctorService
 * getAllDoctors()
 * addDoctor()
 * getDoctorById()
 * getDoctorsByQualificationOrSpec()
 ## EmailService
 * sendEmail()
 ## PasswordEncryptor
 * encrypt()
 ## PatientService
 * patientSignUp()
 * patientSignIn()
 * patientSignOut()
 * getAllPatients()
 * getAllPatientsByBloodGroup()
 ## PTokenService
 * createToken()
 * deletetoken()
 * authenticate()
# Model
## dto
* AuthenticationInputDto
* ScheduleAppointmentDto
* SignInInputDto
## enums
* BloodGroup
* Gender
* Qualification
* Specialization
* Admin
* Appointment
* Doctor
* Patient
* PatientAuthenticationToken
# Repository
 * IAppointmentRepo()
 * IDoctorRepo()
 * IPTokenRepo()
 * IPatientRepo()
 
# Data Structure Used
 MYSQL as database
# Project Summary
Doctor App is used for to create APi's and SignUp , SignIn and SignOut Patient and schedule  appointments .

# Features for Employee
Create /SignUp patient
Create /SignUp Doctor
SignIn patient (Send token on mail for verification)
SignOut patient (Delete token)
Create Appointment (Create the Appointment using email and token)
Get Appontment by id(get the specific AppontmentS by providin email, token and Appontment id)
