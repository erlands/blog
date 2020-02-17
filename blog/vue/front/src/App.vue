<template>
  <section>
    <router-view></router-view>
    <!-- Footer -->
    <my-footer></my-footer>
  </section>
</template>

<script>
import '@/assets/css/full-slider/full-slider.css'
import '@/assets/css/public.css'
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
