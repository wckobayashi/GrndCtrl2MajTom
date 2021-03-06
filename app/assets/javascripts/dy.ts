// Apologies in advance for the Beatles references
(() => {
  'use strict';
/*
  obladi() gets a scrambled series of strings from
  data attributes on an element and assmbles them
  into an email address.
*/
  function obladi(el: Element): string {
    let da = el.getAttribute('data-1'),
        la = el.getAttribute('data-2'),
        ob = el.getAttribute('data-3');
    return ob + la + da;
    // Life goes on
  }

  const emailSpans = document.querySelectorAll('[data-update="email"]');
  for (let i = 0, len = emailSpans.length; i < len; i++) {
    let element = emailSpans[i],
        address = obladi(element);

    element.innerHTML = address;
  }

  const emailLinks = document.querySelectorAll('[data-update="mailLink"]');
  for (let i = 0, len = emailLinks.length; i < len; i++) {
    let element = emailLinks[i],
        address = obladi(element);

    element.innerHTML = '<a href="mailto:' + address + '">' + address + '</a>';
  }
})();
