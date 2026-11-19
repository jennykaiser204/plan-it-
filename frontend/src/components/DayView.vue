<script setup>
</script>
<template>
  <div class="tagesansicht">

    <nav class="ansicht"> <!-- Tages-, Wochen-, Monatsansicht-->
      <button class="aktiv">Tag</button>
      <button>Woche</button>
     <!-- <button>Monat</button> -->
    </nav>

    <header class="kopfzeile">
      <h1 class="wochentag">Mittwoch</h1>
      <p class="datum">18. November 2026</p>
    </header>

    <div class="scrollbereich">
      <div class="raster">
        <div class="zeitspalte">
          <div class="stunde">00:00</div>
          <div class="stunde">01:00</div>
          <div class="stunde">02:00</div>
          <div class="stunde">03:00</div>
          <div class="stunde">04:00</div>
          <div class="stunde">05:00</div>
          <div class="stunde">06:00</div>
          <div class="stunde">07:00</div>
          <div class="stunde">08:00</div>
          <div class="stunde">09:00</div>
          <div class="stunde">10:00</div>
          <div class="stunde">11:00</div>
          <div class="stunde">12:00</div>
          <div class="stunde">13:00</div>
          <div class="stunde">14:00</div>
          <div class="stunde">15:00</div>
          <div class="stunde">16:00</div>
          <div class="stunde">17:00</div>
          <div class="stunde">18:00</div>
          <div class="stunde">19:00</div>
          <div class="stunde">20:00</div>
          <div class="stunde">21:00</div>
          <div class="stunde">22:00</div>
          <div class="stunde">23:00</div>
        </div>

        <div class="tagesspalte">
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>
          <div class="stundenzeile"></div>


          <div class="termin">
            <p class="termin-titel">Webtechnologien</p>
            <p class="termin-info">09:45 · A 029</p>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>

<style src="./DayView.css"></style>