class CreateEvent
{
 CreateEvent_btn=".logged__nav__list__create"
 CreateEvent_btn2=".create-button"
 icon="img[src='/images/LogoFullTextTicketLarge.png']"
 searchbar="input[placeholder='Search events']"
 Events="div[class='sc-eeGUxP iohgoE'] div p"
 PlusBtn=".plus-button"
 //eventtitle="[style="margin-top: 16px;"] > :nth-child(1) > [data-testid="title"]
 orgnaizer="#organizer-input"
 category=".dropdownselect"
 location="div[class='locationdiv'] div div h1"
 venue="label[name='venue']"
 onlineevent="label[name='online']"
 tobeannounced="label[name='none']"
 venuelocationicon="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > p:nth-child(1)"
 venuesearch="input[placeholder='Search for a venue or address.']"
 adress1="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > input:nth-child(2)"
 adress2="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > input:nth-child(2)"
 zipcode="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > input:nth-child(2)"
 city="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > input:nth-child(2)"
 country="div[class='locationdiv'] div div select[class='selecttime']"
 dateandtime="div[class='dateandtimediv'] div div h1"
 singleevent="label[name='single']"
 recurringevent="label[name='recurring']"
 starttime=':nth-child(2) > [style="position: relative; cursor: pointer;"] > .timedropdowndiv > .searchvenuediv1 > .typeborder > .dropdownLast > .selecttime'
 startdate='[data-testid="datepicker-container"]'
 enddate=':nth-child(1) > [style="margin-bottom: 8px;"] > .boxesborders > .divflex > .divflex2 > .calendarinput'
 endtime='[style="margin-top: 0px;"] > [style="position: relative; cursor: pointer;"] > .timedropdowndiv > .searchvenuediv1 > .typeborder > .dropdownLast > .selecttime'
 displaystarttime="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > input:nth-child(1)"
 displayendtime="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(5) > input:nth-child(1)"
 timezone="select[data-testid='timezoneselect']"
 imagebtn=".buttons"
 summary="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h1:nth-child(1)"
 summarybox="textarea[placeholder='Write a short event summary to get attendees excited.']"
 describtionbox="textarea[name='description']"
 letscreateticket=".LetsCreateTextDiv"
 addticketbtn=".AddTicketsButton"
 ticketname="input[class='TicketNameInputDiv']"
 availbailty="input[class='AvailabilityInput']"
 price="input[placeholder='0.00']"
 ticketstime="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > select:nth-child(1)"

 ticketendtime="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(4) > select:nth-child(1)"
 savebtn=".SaveButton"
 publicevent="#public"
 publishnow="#now"
 publishbtn="a[href='/publish']"
}
export default CreateEvent