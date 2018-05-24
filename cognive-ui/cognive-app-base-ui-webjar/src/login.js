// The Vue build_scripts version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import LoginApp from './LoginApp'
import router from './router/RouterLogin'

Vue.config.productionTip = false;

new Vue({
  el: '#login',
  router,
  components: { LoginApp },
  template: '<LoginApp/>'
});
