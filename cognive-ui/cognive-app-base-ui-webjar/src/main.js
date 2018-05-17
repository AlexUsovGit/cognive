// The Vue build_scripts version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ApplicationForIndividual from '@/components/layout/content/search/ApplicationForIndividual'
// Import plugins
import VCalendar from 'v-calendar';
import 'v-calendar/lib/v-calendar.min.css';

Vue.config.productionTip = false;

// Global registration
// ToDo: if global registration contains too much component, refactor according to https://ru.vuejs.org/v2/guide/components-registration.html#%D0%90%D0%B2%D1%82%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F-%D0%B3%D0%BB%D0%BE%D0%B1%D0%B0%D0%BB%D1%8C%D0%BD%D0%B0%D1%8F-%D1%80%D0%B5%D0%B3%D0%B8%D1%81%D1%82%D1%80%D0%B0%D1%86%D0%B8%D1%8F-%D0%B1%D0%B0%D0%B7%D0%BE%D0%B2%D1%8B%D1%85-%D0%BA%D0%BE%D0%BC%D0%BF%D0%BE%D0%BD%D0%B5%D0%BD%D1%82%D0%BE%D0%B2
Vue.component('ApplicationForIndividual', ApplicationForIndividual);

/* Install plugins */
// Date picker
Vue.use(VCalendar, {
  firstDayOfWeek: 2,  // Monday
  formats: { // Default params have been used
    title: 'MMMM YYYY',
    weekdays: 'WW', // Has been changed. 2 chars for displaying.
    navMonths: 'MMM',
    input: ['L', 'YYYY-MM-DD', 'YYYY/MM/DD'],
    dayPopover: 'L',
    data: ['L', 'YYYY-MM-DD', 'YYYY/MM/DD']
  },
  popoverVisibility: 'focus', // Show calendar when input in focus.
  datePickerTintColor: 'rgba(88, 86, 214, 1)' // Background color of the selected date
});

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
});
