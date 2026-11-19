<script setup>
const tage = [
  { name: 'Montag',     datum: '16.11.2026' },
  { name: 'Dienstag',   datum: '17.11.2026' },
  { name: 'Mittwoch',   datum: '18.11.2026' },
  { name: 'Donnerstag', datum: '19.11.2026' },
  { name: 'Freitag',    datum: '20.11.2026' },
  { name: 'Samstag',    datum: '21.11.2026' },
  { name: 'Sonntag',    datum: '22.11.2026' },
]
</script>

<template>
  <div class="wochenansicht">

    <div class="oberleiste">
    <nav class="ansicht"> <!-- Tages-, Wochen-, Monatsansicht-->
      <button>Tag</button>
      <button class="aktiv">Woche</button>
      <!-- <button>Monat</button> -->
    </nav>
    <button class="plus-button">+</button>
    </div>

    <div class="tageszeile">
      <div class="ecke"></div>
      <div v-for="tag in tage" :key="tag.name" class="tag-kopf">
        <span class="tag-name">{{ tag.name }}</span>
        <span class="tag-datum">{{ tag.datum }}</span>
      </div>
    </div>

    <div class="scrollbereich">
      <div class="raster">

        <div class="zeitspalte">
          <div v-for="h in 24" :key="h" class="stunde">
            {{ String(h - 1).padStart(2, '0') }}:00
          </div>
        </div>

        <div v-for="tag in tage" :key="tag.name" class="tagesspalte">
          <div v-for="h in 24" :key="h" class="stundenzeile"></div>
        </div>

      </div>
    </div>

  </div>
</template>

<style src="./WeekView.css"></style>