<script setup>
const events = [
  {
    id: 1,
    title: 'Vorlesung Webentwicklung',
    module: 'Webtechnologien',
    room: 'C 101'
  },
  {
    id: 2,
    title: 'Übung SQL',
    module: 'Datenbanken',
    room: 'B 204'
  },
  {
    id: 3,
    title: 'Vorlesung Statistik',
    module: 'Statistik',
    room: 'A 302'
  }
]
</script>

<template>
  <section>
    <h2>Meine Veranstaltungen</h2>

    <ul>
      <li v-for="event in events" :key="event.id">
        <h3>{{ event.title }}</h3>
        <p>Modul: {{ event.module }}</p>
        <p>Raum: {{ event.room }}</p>
      </li>
    </ul>
  </section>
</template>

<style scoped>
ul {
  display: grid;
  gap: 1rem;
  padding: 0;
  list-style: none;
}

li {
  padding: 1rem;
  border: 1px solid #ddd;
  border-radius: 8px;
}
</style>
