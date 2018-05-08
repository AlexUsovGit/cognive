<!--This is a component for the Login page.-->

<template>
  <div class="container-fluid">
    <div class="row row-main align-items-center">
      <div class="col">
        <div class="form-container text-center">

          <img
            src="../../assets/images/logo-full.png"
            class="logo"
          />

          <h2 class="caption">
            Log in
          </h2>

          <form
            novalidate
            class="text-left"
            @submit.prevent="login"
          >

            <div class="form-group">
              <label for="email">
                Email
              </label>
              <input
                id="email"
                v-model="email"
                :class="{'invalid': !emailValid || !passwordValid}"
                type="email"
                required
                class="form-control"
                placeholder="Enter your email"
              />
              <div
                v-if="!emailValid"
                class="invalid-feedback"
              >
                Invalid email =(
              </div>
            </div>

            <div class="form-group">
              <label for="password">
                Password
              </label>
              <input
                id="password"
                v-model="password"
                :class="{'invalid': !passwordValid}"
                type="password"
                required
                class="form-control"
                placeholder="Enter your password"
              />
              <div class="invalid-feedback">
                Wrong email or password!
              </div>

            </div>

            <div class="row">

              <div class="col">
                <div class="form-check">
                  <input
                    id="remember"
                    v-model="remember"
                    :class="{'checked' : remember}"
                    type="checkbox"
                    class="form-check-input"
                  />
                  <label
                    for="remember"
                    class="form-check-label"
                  >
                    Remember me
                  </label>
                </div>
              </div>

              <div class="col text-right">
                <router-link
                  :to="{name: 'Recovery'}"
                  class="link"
                >
                  Forgot password?
                </router-link>
              </div>

            </div>

            <button
              type="submit"
              class="btn-cgn btn-cgn-prim btn-cgn-xl btn-cgn-arrow"
            >
              Login
              <span class="arrow"></span>
            </button>

          </form>

        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import users from '@/../config/configs-temp/users'

  export default {
    name: 'LoginPage',
    data () {
      return {
        email: '',
        emailValid: true,
        password: '',
        passwordValid: true,
        remember: false
      }
    },
    methods: {
      login: function () {
        this.emailValid = true;
        this.passwordValid = true;

        if (this.email === '' || this.password === '') {
          this.passwordValid = false;
          return
        }

        for (let user of users) {
          if (!this.checkEmail(this.email)) {
            this.emailValid = false;
            return
          } else {
            this.emailValid = true
          }
          if (this.email === user.email && this.password === user.password) {
            alert('Success =)');
            this.resetForm();
            return
          }
        }

        this.passwordValid = false
      },

      // This function checks email. If email is valid it returns true
      checkEmail: function (email) {
        const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email)
      },

      resetForm: function () {
        this.email = '';
        this.password = '';
        this.remember = false;
        this.emailValid = true;
        this.passwordValid = true
      }
    }
  }
</script>

<style scoped lang="scss">
  @import "../../assets/styles/core/core";

  .row-main {
    min-height: 100vh;
    background-color: $color-background;
  }
  .form-container {
    width: 100%;
    max-width: 360px;
    margin: 0 auto;
  }
  .link {
    font-size: 12px;
    font-weight: bold;
    color: $color-main;
  }
  .logo {
    margin-bottom: 70px;
  }
  .caption {
    margin-bottom: 25px;
  }
  .btn-cgn {
    display: block;
    margin: 75px auto 0 auto;
  }
  .arrow {
    content: "";
    display: block;
    position: absolute;
    width: 55px;
    height: 32px;
    top: calc((100% - 32px) / 2);
    right: 0;
    border-left: 2px solid rgba(255, 255, 255, 0.5);
    background: {
      image: url("../../assets/images/button-login.png");
      repeat: no-repeat;
      position: center;
      position-x: 0;
    };
  }
</style>
